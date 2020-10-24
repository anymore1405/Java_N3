package Bai10;

//Nguyễn Khắc Tài - CT030147

public class ThiSinhKhoiB extends ThiSinh {

    public ThiSinhKhoiB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
        this.subj1 = "Toan";
        this.subj2 = "Hoa";
        this.subj3 = "Sinh";

    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + subj1 + " - " + subj2 + " - " + subj3 +
                '}';
    }
}