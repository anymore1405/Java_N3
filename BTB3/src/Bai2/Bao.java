package Bai2;

import java.util.Date;

public class Bao extends TaiLieu {
    private Date ngayPH;

    public Bao(String maTaiLieu, String tenNXB, Date ngayPH) {
        super(maTaiLieu, tenNXB);
        this.ngayPH = ngayPH;
    }

    public Bao(Date ngayPH) {
        this.ngayPH = ngayPH;
    }

    public Date getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(Date ngayPH) {
        this.ngayPH = ngayPH;
    }
}
