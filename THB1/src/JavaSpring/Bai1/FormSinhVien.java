package JavaSpring.Bai1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class FormSinhVien extends Container {
    private JPanel jPanel;
    private JTextField fMaSV;
    private JTextField fHoTen;
    private JComboBox comboBoxGioiTinh;
    private JTextField fDiemTrungBinh;
    private JComboBox comboBoxDoiTuong;
    private JTextField fHocPhi;
    private JTextField fDonVi;
    private JTextField fLuong;
    private JButton btnSave;
    private JButton btnReset;
    private JButton btnExit;
    private JButton btnSaveList;
    SinhVien sinhVien;
    ArrayList<SinhVienHTTT> sinhVienHTTTArrayList;
    ArrayList<SinhVienMatMa> sinhVienMatMaArrayList;
    String doiTuong;

    public FormSinhVien() {
        sinhVienHTTTArrayList = new ArrayList<>();
        sinhVienMatMaArrayList = new ArrayList<>();
        sinhVien = new SinhVien();
        fHocPhi.setEnabled(true);
        fLuong.setEnabled(false);
        fDonVi.setEnabled(false);
        doiTuong = "ATTT";
        btnExit.addActionListener(e -> System.exit(0));
        btnReset.addActionListener(e -> {
            fMaSV.setText("");
            fHoTen.setText("");
            fHocPhi.setText("");
            fDiemTrungBinh.setText("");
            fDonVi.setText("");
            fLuong.setText("");
            comboBoxDoiTuong.setSelectedIndex(0);
            comboBoxGioiTinh.setSelectedIndex(0);
        });
        comboBoxGioiTinh.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                Object item = e.getItem();
                sinhVien.setGioiTinh(item.toString().equals("Nam") ? GioiTinh.Nam : GioiTinh.Nu);
            }
        });
        comboBoxDoiTuong.addItemListener(e -> {
            doiTuong = e.getItemSelectable().toString();
            if (e.getStateChange() == ItemEvent.SELECTED) {
                Object item = e.getItem();

                if (item.toString().equals("ATTT")) {
                    fHocPhi.setEnabled(true);
                    fLuong.setEnabled(false);
                    fDonVi.setEnabled(false);
                } else {
                    fHocPhi.setEnabled(false);
                    fLuong.setEnabled(true);
                    fDonVi.setEnabled(true);
                }
            }
        });
        btnSave.addActionListener(e -> {
            if (doiTuong.equals("ATTT")) {
                SinhVienHTTT sinhVienHTTT = new SinhVienHTTT(fMaSV.getText(), fHoTen.getText(), new Date(), sinhVien.getGioiTinh(), Float.parseFloat(fDiemTrungBinh.getText()), Float.parseFloat(fHocPhi.getText()));
                sinhVienHTTTArrayList.add(sinhVienHTTT);
            } else {
                SinhVienMatMa sinhVienMatMa = new SinhVienMatMa(fMaSV.getText(), fHoTen.getText(), new Date(), sinhVien.getGioiTinh(), Float.parseFloat(fDiemTrungBinh.getText()), fDonVi.getText(), Float.parseFloat(fLuong.getText()));
                sinhVienMatMaArrayList.add(sinhVienMatMa);
            }
            try {
                saveList(true);
                saveList(false);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        btnSaveList.addActionListener(e -> {
            try {
                saveList(true);
                saveList(false);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }

    public void saveList(boolean httt) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(httt ? "svattt.dat" : "svmm.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(httt ? sinhVienHTTTArrayList : sinhVienMatMaArrayList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Quan ly sinh vien");
        jFrame.setContentPane(new FormSinhVien().jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
