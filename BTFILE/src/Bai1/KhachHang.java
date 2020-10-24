package Bai1;

// Nguyễn Khắc Tài - CT030147


public class KhachHang {
    private String hoTen;
    private String ma;
    private int namSinh;

    public KhachHang() {
    }

    public KhachHang(String hoTen, String ma, int namSinh) {
        this.hoTen = hoTen;
        this.ma = ma;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "KhachHang {" +
                "hoTen='" + hoTen + '\'' +
                ", ma='" + ma + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }

    public String toSaveFile() {
        return hoTen + ';' + ma + ';' + namSinh;
    }

    public void readInFile(String s) {
        String[] list = s.split(";");
        hoTen = list[0];
        ma = list[1];
        namSinh = Integer.parseInt(list[2]);
    }
}
