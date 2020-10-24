package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

//Nguyễn Khắc Tài - CT030147


public class Main {
    static Scanner scanner;
    static KhuPho khuPho;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
    }

    public static void nhapHoDan() {
        System.out.print("Nhap n ");
        int n = scanner.nextInt();
        ArrayList<HoDan> hoDanArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ho dan thu " + (i + 1));
            hoDanArrayList.add(new HoDan());
        }
        khuPho = new KhuPho(hoDanArrayList);
    }

    public static void inKhuPho() {
        for (HoDan hoDan : khuPho.getHoDans()) {
            System.out.println(hoDan.toString());
        }
    }
}
