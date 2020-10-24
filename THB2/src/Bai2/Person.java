package Bai2;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    protected String hoTen;
    protected Date ngaySinh;
    protected String diaChi;
    protected GioiTinh gioiTinh;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String diaChi, GioiTinh gioiTinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new Date();
        String[] ngaySinhData = ngaySinh.split("/");
        this.ngaySinh.setDate(Integer.parseInt(ngaySinhData[0]));
        this.ngaySinh.setMonth(Integer.parseInt(ngaySinhData[1]));
        this.ngaySinh.setYear(Integer.parseInt(ngaySinhData[2]));
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh.getDate() + "/" + ngaySinh.getMonth() + "/" + ngaySinh.getYear();
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = new Date();
        String[] ngaySinhData = ngaySinh.split("/");
        this.ngaySinh.setDate(Integer.parseInt(ngaySinhData[0]));
        this.ngaySinh.setMonth(Integer.parseInt(ngaySinhData[1]));
        this.ngaySinh.setYear(Integer.parseInt(ngaySinhData[2]));
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
}
