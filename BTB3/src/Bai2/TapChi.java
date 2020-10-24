package Bai2;

public class TapChi  extends TaiLieu{
    private int soBanPH;
    private int thangPH;

    public TapChi(String maTaiLieu, String tenNXB, int soBanPH, int thangPH) {
        super(maTaiLieu, tenNXB);
        this.soBanPH = soBanPH;
        this.thangPH = thangPH;
    }

    public TapChi(int soBanPH, int thangPH) {
        this.soBanPH = soBanPH;
        this.thangPH = thangPH;
    }

    public TapChi() {
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }
}
