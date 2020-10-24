package Bai12;
import java.time.Year;
import java.util.Scanner;

//Nguyễn Khắc Tài - CT030147

public class Main {

    public static GiaoVien createTeacher(Scanner scanner) {
        System.out.print("Nhap maGV: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        Year yob = Year.of(year);
        System.out.print("Nhap que quan: ");
        String hometown = scanner.nextLine();
        System.out.print("Nhap luong: ");
        double salary = scanner.nextDouble();
        System.out.print("Nhap thuong: ");
        double bonus = scanner.nextDouble();
        System.out.print("Nhap phat: ");
        double penalty = scanner.nextDouble();
        scanner.nextLine();
        return new GiaoVien(name, yob, hometown, id, salary, bonus, penalty);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLy manager = new QuanLy();
        while (true) {
            System.out.println("Quan ly giao vien");
            System.out.println("1: Them moi giao vien");
            System.out.println("2: Xem thong tin giao vien: ");
            System.out.println("3: Xem thong tin giao vien cua giao vien cu the");
            System.out.println("4: Thoat");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    manager.addTeacher(createTeacher(scanner));
                }
                case "2": {
                    manager.showInfo();
                    break;
                }
                case "3": {
                    System.out.print("Nhap maGV: ");
                    String id = scanner.nextLine();
                    Double teacherSalary = manager.getSalary(id);
                    System.out.println(teacherSalary);
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Khong hop le");
            }
        }
    }
}