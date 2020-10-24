package Bai5;

import java.io.Serializable;

public class GiangVien implements Serializable {
    private String hoTen;
    private String maGiangVien;
    private String diaChi;
    private GioiTinh gioiTinh;
    private Khoa khoa;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String maGiangVien, String diaChi, GioiTinh gioiTinh, Khoa khoa) {
        this.hoTen = hoTen;
        this.maGiangVien = maGiangVien;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                "hoTen='" + hoTen + '\'' +
                ", maGiangVien='" + maGiangVien + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", khoa=" + khoa +
                '}';
    }
}
