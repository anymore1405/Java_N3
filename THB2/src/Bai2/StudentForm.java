package Bai2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class StudentForm {
    private JPanel jPanel;
    private JTextField fHoTen;
    private JTextField fMaSV;
    private JComboBox comboBoxGioiTinh;
    private JTextField fDiemTK;
    private JButton btnExit;
    private JButton btnReset;
    private JButton btnSaveList;
    private JButton btnAdd;
    private JTextField fEmail;
    private JTextField fDiaChi;
    private JTable table;
    private JTextField tNgaySinh;
    private DefaultTableModel model;
    ArrayList<Student> studentArrayList;

    public StudentForm() {
        studentArrayList = new ArrayList<>();
        try {
            loadDataFormArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Objects.equals(comboBoxGioiTinh.getSelectedItem(), "Nam") ? GioiTinh.Nam : GioiTinh.Nu);
                Student student = new Student(fHoTen.getText(), tNgaySinh.getText(), fDiaChi.getText(), Objects.equals(comboBoxGioiTinh.getSelectedItem(), "Nam") ? GioiTinh.Nam : GioiTinh.Nu, fMaSV.getText(), fEmail.getText(), Float.parseFloat(fDiemTK.getText()));
                studentArrayList.add(student);
                Vector vector = new Vector();
                vector.add(student.getHoTen());
                vector.add(student.getDiaChi());
                vector.add(student.getNgaySinh());
                vector.add(student.getMaSV());
                vector.add(student.getGioiTinh());
                vector.add(student.getDiemTK());
                vector.add(student.getEmail());
                model.addRow(vector);
                reset();
                JOptionPane.showMessageDialog(jPanel, "Thêm thành công!");
            }
        });
        btnSaveList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveFile();
                    JOptionPane.showMessageDialog(jPanel, "Lưu thành công!");
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
    }

    public void loadDataFormArray() throws Exception {
        readFile();
        for (Student student : studentArrayList) {
            Vector vector = new Vector();
            vector.add(student.getHoTen());
            vector.add(student.getDiaChi());
            vector.add(student.getNgaySinh());
            vector.add(student.getMaSV());
            vector.add(student.getGioiTinh());
            vector.add(student.getDiemTK());
            vector.add(student.getEmail());
            model.addRow(vector);
        }
    }

    public void reset() {
        fHoTen.setText("");
        fMaSV.setText("");
        fDiemTK.setText("");
        fEmail.setText("");
        fDiaChi.setText("");
    }

    public void saveFile() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("sinhvien.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(studentArrayList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public void readFile() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("sinhvien.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        studentArrayList = (ArrayList<Student>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Quan ly sinh vien");
        jFrame.setContentPane(new StudentForm().jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    private void createUIComponents() {
        model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("Họ tên");
        model.addColumn("Địa chỉ");
        model.addColumn("Ngày sinh");
        model.addColumn("Mã sinh viên");
        model.addColumn("Giới tính");
        model.addColumn("Điểm tổng kết");
        model.addColumn("Email");
    }
}
