package File.Bai1;

import java.io.Serializable;

public class SinhVien implements Serializable {
    protected String hoTen;
    protected int tuoi;

    public SinhVien(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien {" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
