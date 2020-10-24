package Bai2;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String tenNXB, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNXB);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach() {
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
