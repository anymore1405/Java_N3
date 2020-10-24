package Bai5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GiangVienForm {
    private JPanel jPanel;
    private JTextField tHoTen;
    private JTextField tMaGiangVien;
    private JTextField tDiaChi;
    private JComboBox comboBoxGioiTinh;
    private JComboBox comboBoxKhoa;
    private JButton btnSave;
    private JButton btnClear;
    private JButton btnExit;
    private JRadioButton jRadioButton;
    private ArrayList<GiangVien> giangVienArrayList;

    public GiangVienForm() {
        giangVienArrayList = new ArrayList<>();
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addGianVien();
                JOptionPane.showMessageDialog(jPanel, "Thêm thành công!");
                try {
                    saveFile();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public void addGianVien() {
        GiangVien giangVien = new GiangVien();
        giangVien.setHoTen(tHoTen.getText());
        giangVien.setDiaChi(tDiaChi.getText());
        giangVien.setGioiTinh(comboBoxGioiTinh.getSelectedItem() == "Nam" ? GioiTinh.Nam : GioiTinh.Nu);
        giangVien.setMaGiangVien(tMaGiangVien.getText());
        Object selectedItem = comboBoxKhoa.getSelectedItem();
        if ("DTVT".equals(selectedItem)) {
            giangVien.setKhoa(Khoa.DTVT);
        } else if ("CNTT".equals(selectedItem)) {
            giangVien.setKhoa(Khoa.CNTT);
        } else if ("HTTT".equals(selectedItem)) {
            giangVien.setKhoa(Khoa.HTTT);
        } else if ("CNM".equals(selectedItem)) {
            giangVien.setKhoa(Khoa.CNM);
        } else if ("CNPM".equals(selectedItem)) {
            giangVien.setKhoa(Khoa.CNPM);
        }
        giangVienArrayList.add(giangVien);
    }

    public void clear() {
        tHoTen.setText("");
        tMaGiangVien.setText("");
        tDiaChi.setText("");
        comboBoxGioiTinh.setSelectedIndex(0);
        comboBoxKhoa.setSelectedIndex(0);
    }

    public void saveFile() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("giangvien.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(giangVienArrayList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Quan ly giang vien");
        jFrame.setContentPane(new GiangVienForm().jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
//        try {
//            read();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static void read() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("giangvien.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<GiangVien> arrayList = (ArrayList<GiangVien>) objectInputStream.readObject();
        for (GiangVien giangVien: arrayList){
            System.out.println(giangVien.toString());
        }
        objectInputStream.close();
        fileInputStream.close();
    }
}
