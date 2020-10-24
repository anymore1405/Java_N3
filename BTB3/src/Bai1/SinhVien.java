package Bai1;

import java.util.Scanner;


// Nguyễn Khắc Tài - CT030147

// Khai báo lớp sinh viên kế thừa từ lớp người và thêm các thuộc tính: mã sinh viên, điểm trung bình.

public class SinhVien extends Nguoi {
    private String maSV;
    private float diemTB;

    public SinhVien() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien = ");
        maSV = scanner.nextLine();
        System.out.println("Nhap diem tb = ");
        diemTB = scanner.nextFloat();
    }

    public SinhVien(String hoTen, int namSinh, String maSV, float diemTB) {
        super(hoTen, namSinh);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien {" +
                "maSV='" + maSV + '\'' +
                ", diemTB=" + diemTB +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
}
