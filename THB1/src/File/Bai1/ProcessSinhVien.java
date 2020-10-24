package File.Bai1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessSinhVien {
    protected ArrayList<SinhVien> sinhVienArrayList;
    String filename = "sinhvien.dat";

    public ProcessSinhVien() {
        sinhVienArrayList = new ArrayList<>();
    }

    public void create() {
        System.out.println("Nhap so luong sinh vien n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            SinhVien sinhVien = new SinhVien();
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            scanner.nextLine();
            System.out.print("Nhap ten = ");
            sinhVien.setHoTen(scanner.nextLine());
            System.out.print("Nhap tuoi = ");
            sinhVien.setTuoi(scanner.nextInt());
            sinhVienArrayList.add(sinhVien);
        }
    }

    public void writeToFile() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sinhVienArrayList);
        System.out.println("Ghi file thanh cong!");
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public void readFromFile() throws Exception {
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        sinhVienArrayList = (ArrayList<SinhVien>) objectInputStream.readObject();
        System.out.println("Doc file thanh cong!");
        objectInputStream.close();
        fileInputStream.close();
    }

    public void print() {
        for (SinhVien sinhVien : sinhVienArrayList) {
            System.out.println(sinhVien.toString());
        }
    }
}
