package Bai3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NhanVien extends Person {
    private String phongBan;
    private float heSoLuong;
    private float thamNien;
    private float luongCoBan;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, String diaChi, GioiTinh gioiTinh, String phongBan, float heSoLuong, float thamNien, float luongCoBan) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }


    public float getLuongLinhThuc() {
        return luongCoBan * heSoLuong * (1 + thamNien / 100);
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public Float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Float getThamNien() {
        return thamNien;
    }

    public void setThamNien(float thamNien) {
        this.thamNien = thamNien;
    }

    public Float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public static ArrayList<NhanVien> readFile(String filename) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(filename);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ArrayList<NhanVien> arrayList = new ArrayList<>();
        while (bufferedReader.ready()) {
            String data = bufferedReader.readLine();
            String[] arr = data.split("\\$");
            NhanVien nhanVien = new NhanVien();
            nhanVien.setHoTen(arr[0]);
            nhanVien.setDiaChi(arr[1]);
            nhanVien.setNgaySinh(arr[2]);
            nhanVien.setGioiTinh(arr[3].equals("Nam") ? GioiTinh.Nam : GioiTinh.Nu);
            nhanVien.setPhongBan(arr[4]);
            nhanVien.setHeSoLuong(Float.parseFloat(arr[5]));
            nhanVien.setThamNien(Float.parseFloat(arr[6]));
            nhanVien.setLuongCoBan(Float.parseFloat(arr[7]));
            arrayList.add(nhanVien);
        }
        return arrayList;
    }
}
