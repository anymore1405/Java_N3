package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

//Nguyễn Khắc Tài - CT030147

public class QLCB {
    static Scanner scanner;
    static ArrayList<CanBo> canBoArrayList;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        canBoArrayList = new ArrayList<>();
    }

    public static void nhapThongTinCanBo() {
        CanBo canBo = new CanBo();
        System.out.println("Nhap ho ten ");
        canBo.setHoTen(scanner.nextLine());
        System.out.println("Nhap nam sinh ");
        canBo.setNamSinh(scanner.nextInt());
        System.out.println("Nhap dia chi ");
        canBo.setDiaChi(scanner.nextLine());
        canBoArrayList.add(canBo);
    }

    public static ArrayList<CanBo> timKiemTheoHoTen() {
        System.out.print("Nhap ten can tim kiem ");
        String ten = scanner.nextLine();
        ArrayList<CanBo> list = new ArrayList<>();
        for (CanBo canBo : canBoArrayList) {
            if (canBo.getHoTen().contains(ten))
                list.add(canBo);
        }
        return list;
    }

    public static void inDanhSachCanBo() {
        for (CanBo canBo : canBoArrayList) {
            System.out.println(canBo.toString());
        }
    }
    public static void thoat() {
        System.exit(0);
    }
}
