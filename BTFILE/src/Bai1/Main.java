package Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// Nguyễn Khắc Tài - CT030147


//Bài 1: Viết phần mềm quản lý Khách Hàng dùng TextFile:
//        Khách hàng : Mã, tên, năm sinh
//        Cho nhập danh sách Khách Hàng từ bàn phím
//        Cho xuất danh sách khách hàng ra màn hình
//        Cho lưu danh sách khách hàng vào ổ cứng
//        Cho đọc danh sách khách hang từ ổ cứng


public class Main {
    static ArrayList<KhachHang> khachHangArrayList;
    static String filename = "khach_hang.txt";

    public static void main(String[] args) {
        khachHangArrayList = new ArrayList<>();
        menu();
    }

    public static void menu() {
        System.out.println("Lua chon chuc nang");
        System.out.println("1. Nhap khach hang");
        System.out.println("2. In khach hang");
        System.out.println("3. Luu vao file");
        System.out.println("4. Doc tu file");
        System.out.println("5. Exit");
        System.out.print("Nhap lua chon ");
        Scanner scanner = new Scanner(System.in);
        int luaChon = scanner.nextInt();
        while (luaChon <= 0 || luaChon > 5) {
            System.out.println("Nhap lai lua chon");
            luaChon = scanner.nextInt();
        }
        switch (luaChon) {
            case 1: {
                nhapKhachHang();
                break;
            }
            case 2: {
                xuatKhachHang();
                break;
            }
            case 3: {
                try {
                    luu();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {
                try {
                    xuatTuFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 5: {
                System.exit(0);
                break;
            }
        }
        menu();
    }

    public static void nhapKhachHang() {
        System.out.print("Nhap so luong khach hang n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            KhachHang khachHang = new KhachHang();
            System.out.println("Nhap thong tin khach hang thu " + (i + 1));
            System.out.print("Nhap ho ten = ");
            scanner.nextLine();
            khachHang.setHoTen(scanner.nextLine());
            System.out.print("Nhap ma = ");
            khachHang.setMa(scanner.nextLine());
            System.out.print("Nhap nam sinh = ");
            khachHang.setNamSinh(scanner.nextInt());
            khachHangArrayList.add(khachHang);
        }
    }

    public static void xuatKhachHang() {
        for (KhachHang khachHang : khachHangArrayList) {
            System.out.println(khachHang.toString());
        }
    }

    public static void luu() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        for (KhachHang khachHang : khachHangArrayList) {
            bufferedWriter.write(khachHang.toSaveFile());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        outputStreamWriter.close();
        fileOutputStream.close();
        System.out.println("Luu thanh cong!");
    }

    public static void xuatTuFile() throws Exception {
        File file = new File(filename);
        if (file.isFile() && file.canRead()) {
            FileInputStream fileInputStream = new FileInputStream(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (bufferedReader.ready()) {
                KhachHang khachHang = new KhachHang();
                khachHang.readInFile(bufferedReader.readLine());
                System.out.println(khachHang.toString());
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } else {
            System.out.println("File khong hop le hoac rong!");
        }
    }
}
