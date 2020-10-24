package Bai2;

public class TaiLieu {
    private String maTaiLieu;
    private String tenNXB;

    public TaiLieu(String maTaiLieu, String tenNXB) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
    }

    public TaiLieu() {
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }
}
