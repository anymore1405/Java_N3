import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected int namSinh;

    public Nguoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten = ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap nam sinh = ");
        namSinh = scanner.nextInt();
    }

    public Nguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh;
    }
}
