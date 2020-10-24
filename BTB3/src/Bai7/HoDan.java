package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

//Nguyễn Khắc Tài - CT030147


public class HoDan {
    private ArrayList<Nguoi> thanhVien;
    private int soNha;

    public ArrayList<Nguoi> getThanhVien() {
        return thanhVien;
    }

    public HoDan(ArrayList<Nguoi> thanhVien, int soNha) {
        this.thanhVien = thanhVien;
        this.soNha = soNha;
    }

    public HoDan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nha ");
        soNha = scanner.nextInt();
        System.out.println("Nhap so thanh vien ");
        int soThanhVien = scanner.nextInt();
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nhap thanh vien thu " + (i + 1) + " ");
            thanhVien.add(new Nguoi());
        }
    }

    public void setThanhVien(ArrayList<Nguoi> thanhVien) {
        this.thanhVien = thanhVien;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int soThanhVien() {
        return thanhVien.size();
    }

    @Override
    public String toString() {
        String tv = "";
        for (Nguoi nguoi : thanhVien) {
            tv = nguoi.toString() + "\n";
        }
        return "HoDan{" +
                ", soNha=" + soNha +
                '}' +
                tv;
    }
}
