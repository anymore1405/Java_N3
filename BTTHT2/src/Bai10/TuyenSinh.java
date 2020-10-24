package Bai10;

import java.util.ArrayList;
import java.util.List;

//Nguyễn Khắc Tài - CT030147

public class TuyenSinh {
    List<ThiSinh> thiSinhs;
    public TuyenSinh() {
        this.thiSinhs = new ArrayList<>();
    }

    public void add(ThiSinh thiSinh) {
        this.thiSinhs.add(thiSinh);
    }

    public void showInfo() {
        this.thiSinhs.forEach(thiSinh -> System.out.println(thiSinh.toString()));
    }

    public ThiSinh searchById(String id) {
        return this.thiSinhs.stream().filter(thiSinh -> thiSinh.getId().equals(id)).findFirst().orElse(null);
    }
}