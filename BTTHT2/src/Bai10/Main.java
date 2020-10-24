package Bai10;

import java.util.Scanner;

//Nguyễn Khắc Tài - CT030147

public class Main {

    public static ThiSinh themThiSinh(Scanner scanner, String khoi) {
        System.out.print("Nhap ID: ");
        String id = scanner.nextLine();
        System.out.print("Nhap name: ");
        String name = scanner.nextLine();
        System.out.print("Nhap address: ");
        String address = scanner.nextLine();
        System.out.print("Nhap priority: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (khoi.equals("a")) {
            return new ThiSinhKhoiA(id, name, address, priority);
        } else if (khoi.equals("b")) {
            return new ThiSinhKhoiB(id, name, address, priority);
        } else {
            return new ThiSinhKhoiC(id, name, address, priority);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        while (true) {
            System.out.println("Tuyen sinh");
            System.out.println("1: them thi sinh");
            System.out.println("2: Xem thong tin thi sinh: ");
            System.out.println("3: Tim kiem thi sinh theo ma ");
            System.out.println("4: Thoat:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhap a: Them thi sinh khoi A");
                    System.out.println("Nhap b: Them thi sinh khoi B");
                    System.out.println("Nhap c: Them thi sinh khoi C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            tuyenSinh.add(themThiSinh(scanner, "a"));
                            break;

                        }
                        case "b": {
                            tuyenSinh.add(themThiSinh(scanner, "b"));
                            break;
                        }
                        case "c": {
                            tuyenSinh.add(themThiSinh(scanner, "c"));
                            break;
                        }
                        default:
                            System.out.println("Khong hop le");
                            break;
                    }
                    break;
                }
                case "2": {
                    tuyenSinh.showInfo();
                    break;
                }
                case "3": {
                    System.out.print("Nhap maSV: ");
                    String id = scanner.nextLine();
                    ThiSinh thiSinh = tuyenSinh.searchById(id);
                    if (thiSinh == null) {
                        System.out.println("Khong tim thay");
                    } else {
                        System.out.println(thiSinh.toString());
                    }
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