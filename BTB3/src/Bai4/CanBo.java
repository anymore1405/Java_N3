package Bai4;

//Nguyễn Khắc Tài - CT030147

public class CanBo {
    protected String hoTen;
    protected int namSinh;
    protected String diaChi;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public CanBo(String hoTen, int namSinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }
    public CanBo() {}

    @Override
    public String toString() {
        return "CanBo {" +
                "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
