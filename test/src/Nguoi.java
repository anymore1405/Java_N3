import java.io.Serializable;
import java.util.Scanner;

public class Nguoi implements Serializable {
    private String ten;
    private int tuoi;

    public Nguoi() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten");
        ten = scanner.nextLine();
        System.out.println("Nhap tuoi");
        tuoi = scanner.nextInt();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Nguoi(String ten, int tuoi) {
        super();
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
