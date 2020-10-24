package File.Bai1;

import java.util.Scanner;

public class Main {
    static ProcessSinhVien processSinhVien;

    public static void main(String[] args) {
        processSinhVien = new ProcessSinhVien();
        menu();
    }

    public static void menu() {
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Ghi danh sach sinh vien vao file");
        System.out.println("3. Doc danh sach sinh vien tu file");
        System.out.println("4. In danh sach sinh vien");
        System.out.println("5. Exit");
        System.out.print("Nhap lua chon ");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        while (c < 1 || c > 5) {
            System.out.print("Nhap lai lua chon ");
            c = scanner.nextInt();
        }
        switch (c) {
            case 1: {
                processSinhVien.create();
                break;
            }
            case 2: {
                try {
                    processSinhVien.writeToFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                try {
                    processSinhVien.readFromFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {
                processSinhVien.print();
                break;
            }
            case 5:{
                System.exit(0);
                break;
            }
        }
        menu();
    }
}
