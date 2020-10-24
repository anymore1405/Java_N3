package Bai3;

import java.io.Serializable;

// Nguyễn Khắc Tài - CT030147

public class NhanVien extends Persion implements Serializable {
    private String phongBan;
    private float heSoLuong;
    private float thamNien;
    private float luongCoBan;

    public NhanVien(String hoTen, String ngaySinh, String diaChi, GioiTinh gioiTinh, String phongBan, float heSoLuong, float thamNien, float luongCoBan) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien() {
    }

    public NhanVien(String phongBan, float heSoLuong, float thamNien, float luongCoBan) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public float getThamNien() {
        return thamNien;
    }

    public void setThamNien(float thamNien) {
        this.thamNien = thamNien;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public float getLuongLinhThuc() {
        return luongCoBan * heSoLuong * (1 + thamNien / 100);
    }

    @Override
    public String toString() {
        return "NhanVien {" +
                "phongBan='" + phongBan + '\'' +
                ", heSoLuong=" + heSoLuong +
                ", thamNien=" + thamNien +
                ", luongCoBan=" + luongCoBan +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                ", luong linh thuc ='" + getLuongLinhThuc() + '\'' +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
