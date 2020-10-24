package Bai3;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

// Nguyễn Khắc Tài - CT030147

public class Main {
    static ArrayList<NhanVien> nhanVienArrayList;
    static String filename = "nhanvien.dat";

    public static void main(String[] args) {
        nhanVienArrayList = new ArrayList<>();
        menu();
    }

    public static void menu() {
        System.out.println("Lua chon chuc nang");
        System.out.println("1. Nhap nhan vien");
        System.out.println("2. In danh sach nhan vien");
        System.out.println("3. Luu vao file");
        System.out.println("4. Doc tu file");
        System.out.println("5. Copy sang file khac");
        System.out.println("6. Exit");
        System.out.print("Nhap lua chon ");
        Scanner scanner = new Scanner(System.in);
        int luaChon = scanner.nextInt();
        while (luaChon <= 0 || luaChon > 6) {
            System.out.println("Nhap lai lua chon");
            luaChon = scanner.nextInt();
        }
        switch (luaChon) {
            case 1: {
                nhapNhanVien();
                break;
            }
            case 2: {
                xuatNhanVien();
                break;
            }
            case 3: {
                try {
                    luuFile(filename);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {
                try {
                    docFile(filename);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 5: {
                try {
                    copyNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 6: {
                System.exit(0);
                break;
            }
        }
        menu();
    }

    public static void nhapNhanVien() {
        System.out.print("Nhap so luong nhan vien n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            NhanVien nhanVien = new NhanVien();
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1));
            System.out.print("Nhap ho ten nhan vien = ");
            scanner.nextLine();
            nhanVien.setHoTen(scanner.nextLine());
            System.out.print("Nhap ngay sinh (DD-MM-YYYY) = ");
            nhanVien.setNgaySinh(scanner.nextLine());
            System.out.print("Nhap dia chi = ");
            nhanVien.setDiaChi(scanner.nextLine());
            System.out.print("Nhap gioi tinh (Nam = 1, Nu = 0) = ");
            nhanVien.setGioiTinh(scanner.nextInt() == 1 ? GioiTinh.Nam : GioiTinh.Nu);
            scanner.nextLine();
            System.out.print("Nhap phong ban = ");
            nhanVien.setPhongBan(scanner.nextLine());
            System.out.print("Nhap he so luong = ");
            nhanVien.setHeSoLuong(scanner.nextFloat());
            System.out.print("Nhap tham nien = ");
            nhanVien.setThamNien(scanner.nextFloat());
            System.out.print("Nhap luong co ban = ");
            nhanVien.setLuongCoBan(scanner.nextFloat());
            nhanVienArrayList.add(nhanVien);
        }
    }

    public static void xuatNhanVien() {
        for (NhanVien nhanVien : nhanVienArrayList) {
            System.out.println(nhanVien.toString());
        }
    }

    public static void luuFile(String name) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(name);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(nhanVienArrayList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static void docFile(String name) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(name);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        nhanVienArrayList = (ArrayList<NhanVien>) objectInputStream.readObject();
        xuatNhanVien();
        objectInputStream.close();
        fileInputStream.close();
    }

    public static void copyNewFile() throws Exception {
        System.out.println("Nhap ten file = ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        luuFile(name);
    }
}
