package Bai10;

//Nguyễn Khắc Tài - CT030147

public class ThiSinhKhoiA extends ThiSinh {

    public ThiSinhKhoiA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
        this.subj1 = "Toan";
        this.subj2 = "Ly";
        this.subj3 = "Hoa";

    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + subj1 + " - " + subj2 + " - " + subj3 +
                '}';
    }
}