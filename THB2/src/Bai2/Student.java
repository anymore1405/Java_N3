package Bai2;

import java.io.Serializable;


public class Student extends Person implements Serializable {
    private String maSV;
    private String email;
    private float diemTK;

    public Student() {
    }

    public Student(String maSV, String email, float diemTK) {
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }

    public Student(String hoTen, String ngaySinh, String diaChi, GioiTinh gioiTinh, String maSV, String email, float diemTK) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(float diemTK) {
        this.diemTK = diemTK;
    }
}
