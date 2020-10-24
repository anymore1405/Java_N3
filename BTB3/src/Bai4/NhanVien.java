package Bai4;

//Nguyễn Khắc Tài - CT030147

public class NhanVien extends CanBo {
    protected String congViec;

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String hoTen, int namSinh, String diaChi, String congViec) {
        super(hoTen, namSinh, diaChi);
        this.congViec = congViec;
    }
}
