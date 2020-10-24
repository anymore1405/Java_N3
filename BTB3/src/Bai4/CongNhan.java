package Bai4;

//Nguyễn Khắc Tài - CT030147

public class CongNhan extends CanBo {
    protected int bac;

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public CongNhan(String hoTen, int namSinh, String diaChi, int bac) {
        super(hoTen, namSinh, diaChi);
        this.bac = bac;
    }
}
