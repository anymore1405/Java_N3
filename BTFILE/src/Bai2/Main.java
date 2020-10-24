package Bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// Nguyễn Khắc Tài - CT030147

//Bài 2: Viết chương trình thực hiện các yêu cầu sau:
//       - Khai báo lớp người với các thuộc tính: họ tên, năm sinh. diemTB
//       - Khai báo lớp sinh viên kế thừa từ lớp người và thêm các thuộc tính: mã sinh viên, điểm trung bình.
//       - Xây dựng các phương thức: nhập, xuất cho các đối tượng sinh viên.
//       - Nhập vào n sinh viên.
//       - Xếp loại sinh viên theo diemTB (sử dụng Enum)
//       - Sắp xếp lại và in ra màn hình danh sách sinh viên theo thứ tự giảm dần của điểm trung bình. Nhập thông tin tìm kiếm theo mã sinh viên.  In ra danh sách
//       - Lưu file và đọc file ra màn hình console


public class Main {
    static ArrayList<SinhVien> sinhVienArrayList;
    static String filename = "sinhvien";

    public static void main(String[] args) {
        sinhVienArrayList = new ArrayList<>();
        menu();
    }

    public static void menu() {
        System.out.println("Lua chon chuc nang");
        System.out.println("1. Nhap sinh vien");
        System.out.println("2. In danh sach sinh vien theo thu tu giam dan diem trung binh");
        System.out.println("3. Luu vao file");
        System.out.println("4. Doc tu file");
        System.out.println("5. Tim kiem theo ma sinh vien");
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
                nhapSinhVien();
                break;
            }
            case 2: {
                xuatSinhVien();
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
                timKiem();
                break;
            }
            case 6: {
                System.exit(0);
                break;
            }
        }
        menu();
    }

    public static void nhapSinhVien() {
        System.out.print("Nhap so luong sinh vien n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            SinhVien sinhVien = new SinhVien();
            System.out.println("Nhap thong tin khach hang thu " + (i + 1));
            System.out.print("Nhap ho ten sinh vien = ");
            scanner.nextLine();
            sinhVien.setHoTen(scanner.nextLine());
            System.out.print("Nhap ma sinh vien = ");
            sinhVien.setMaSinhVien(scanner.nextLine());
            System.out.print("Nhap nam sinh = ");
            sinhVien.setNamSinh(scanner.nextInt());
            System.out.print("Nhap diem trung binh = ");
            sinhVien.setDiemTB(scanner.nextFloat());
            sinhVienArrayList.add(sinhVien);
        }
    }

    public static void xuatSinhVien() {
        ArrayList<SinhVien> sinhViens = (ArrayList<SinhVien>) sinhVienArrayList.clone();
        sinhViens.sort((a, b) -> (int) (a.getDiemTB() - b.getDiemTB()));
        for (SinhVien sinhVien : sinhViens) {
            System.out.println(sinhVien.toString());
        }
    }

    public static void luu() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sinhVienArrayList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static void xuatTuFile() throws Exception {
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        sinhVienArrayList = (ArrayList<SinhVien>) objectInputStream.readObject();
        for (SinhVien sinhVien : sinhVienArrayList) {
            System.out.println(sinhVien.toString());
        }
        objectInputStream.close();
        fileInputStream.close();
    }
    public static void timKiem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien can tim kiem");
        String msv = scanner.nextLine();
        sinhVienArrayList.forEach((sinhVien -> {
            if(sinhVien.getMaSinhVien().contains(msv)){
                System.out.println(sinhVien.toString());
            }
        }));
    }
}
