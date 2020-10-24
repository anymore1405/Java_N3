package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

// Nguyễn Khắc Tài - CT030147

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> sinhVienArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n SV\nNhap n = ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sv " + (i + 1));
            sinhVienArrayList.add(new SinhVien());
        }
        sinhVienArrayList.sort((sv1, sv2) -> (int) (sv2.getDiemTB() - sv1.getDiemTB()));

        for (SinhVien sinhVien : sinhVienArrayList) {
            System.out.println(sinhVien.toString());
        }

        System.out.print("Tim kiem theo ma sinh vien. Nhap ma sinh vien = ");
        scanner = new Scanner(System.in);
        String msv = scanner.nextLine();
        for (SinhVien sinhVien : sinhVienArrayList) {
            if (sinhVien.getMaSV().contains(msv))
                System.out.println(sinhVien.toString());
        }
    }
}
