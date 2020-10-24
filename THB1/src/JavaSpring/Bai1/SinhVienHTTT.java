package JavaSpring.Bai1;

import java.io.Serializable;
import java.util.Date;

public class SinhVienHTTT extends SinhVien implements Serializable {
    private float hocPhi;

    public SinhVienHTTT() {
    }

    public SinhVienHTTT(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienHTTT(String maSV, String hoTen, Date ngaySinh, GioiTinh gioiTinh, float diemTrungBinh) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTrungBinh);
    }

    public SinhVienHTTT(String maSV, String hoTen, Date ngaySinh, GioiTinh gioiTinh, float diemTrungBinh, float hocPhi) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTrungBinh);
        this.hocPhi = hocPhi;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return "SinhVienHTTT {" +
                "hocPhi=" + hocPhi +
                ", maSV='" + maSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }
}
