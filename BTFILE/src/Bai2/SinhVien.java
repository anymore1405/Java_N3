package Bai2;

import java.io.Serializable;

// Nguyễn Khắc Tài - CT030147

public class SinhVien extends Nguoi implements Serializable {
    private String maSinhVien;
    private float diemTB;
    private XepLoai xepLoai;

    public SinhVien() {
    }

    private void xetDiemTB() {
        if (diemTB < 4) {
            xepLoai = XepLoai.Yeu;
        } else if (diemTB < 6) {
            xepLoai = XepLoai.TrungBinh;
        } else if (diemTB < 8) {
            xepLoai = XepLoai.Kha;
        } else {
            xepLoai = XepLoai.Gioi;
        }
    }

    public SinhVien(String maSinhVien, float diemTB) {
        this.maSinhVien = maSinhVien;
        this.diemTB = diemTB;
        xetDiemTB();
    }

    public SinhVien(String hoTen, int namSinh, String maSinhVien, float diemTB) {
        super(hoTen, namSinh);
        this.maSinhVien = maSinhVien;
        this.diemTB = diemTB;
        xetDiemTB();
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
        xetDiemTB();
    }

    public XepLoai getXepLoai() {
        return xepLoai;
    }

    @Override
    public String toString() {
        return "SinhVien {" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", diemTB=" + diemTB +
                ", xepLoai=" + xepLoai +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
}
