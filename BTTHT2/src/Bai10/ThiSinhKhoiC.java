package Bai10;

//Nguyễn Khắc Tài - CT030147

public class ThiSinhKhoiC extends ThiSinh {


    public ThiSinhKhoiC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
        this.subj1 = "Van";
        this.subj2 = "Su";
        this.subj3 = "Dia";
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + subj1 + " - " + subj2 + " - " + subj3 +
                '}';
    }
}