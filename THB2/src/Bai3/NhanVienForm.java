package Bai3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Vector;

public class NhanVienForm {
    private JPanel jPanel;
    private JTable table;
    private DefaultTableModel model;
    private ArrayList<NhanVien> arrayList;

    public NhanVienForm() {
        try {
            arrayList = NhanVien.readFile("nhanvien.dat");
            for (NhanVien nhanVien: arrayList){
                Vector vector = new Vector();
                vector.add(nhanVien.getHoTen());
                vector.add(nhanVien.getDiaChi());
                vector.add(nhanVien.getNgaySinh());
                vector.add(nhanVien.getGioiTinh());
                vector.add(nhanVien.getPhongBan());
                vector.add(nhanVien.getHeSoLuong());
                vector.add(nhanVien.getThamNien());
                vector.add(nhanVien.getLuongCoBan());
                vector.add(nhanVien.getLuongLinhThuc());
                model.addRow(vector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Quan ly Nhan vien");
        jFrame.setContentPane(new NhanVienForm().jPanel);
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
        model.addColumn("Giới tính");
        model.addColumn("Phòng ban");
        model.addColumn("Hệ số lương");
        model.addColumn("Thâm niên");
        model.addColumn("Lương cơ bản");
        model.addColumn("Lương lĩnh thực");
    }
}
