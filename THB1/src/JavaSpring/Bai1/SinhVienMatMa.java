package JavaSpring.Bai1;

import java.io.Serializable;
import java.util.Date;

public class SinhVienMatMa extends SinhVien implements Serializable {
    private String donVi;
    private float luong;

    public SinhVienMatMa() {
    }

    public SinhVienMatMa(String donVi, float luong) {
        this.donVi = donVi;
        this.luong = luong;
    }

    public SinhVienMatMa(String maSV, String hoTen, Date ngaySinh, GioiTinh gioiTinh, float diemTrungBinh) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTrungBinh);
    }

    public SinhVienMatMa(String maSV, String hoTen, Date ngaySinh, GioiTinh gioiTinh, float diemTrungBinh, String donVi, float luong) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTrungBinh);
        this.donVi = donVi;
        this.luong = luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "SinhVienMatMa{" +
                "donVi='" + donVi + '\'' +
                ", luong=" + luong +
                ", maSV='" + maSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }
}
