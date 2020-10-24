package Bai7;

import java.util.ArrayList;

//Nguyễn Khắc Tài - CT030147


public class KhuPho {
    public KhuPho(ArrayList<HoDan> hoDans) {
        this.hoDans = hoDans;
    }

    private ArrayList<HoDan> hoDans;

    public ArrayList<HoDan> getHoDans() {
        return hoDans;
    }

    public void setHoDans(ArrayList<HoDan> hoDans) {
        this.hoDans = hoDans;
    }
}
