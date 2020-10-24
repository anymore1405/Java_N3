import java.util.ArrayList;
import java.util.Scanner;

// Nguyễn Khắc Tài - CT030147

public class Bai31 {

//    Dùng hàm thực hiện các chức năng sau:
//    a. Nhập vào mảng A gồm n phần tử
//    b. Sắp xếp mảng tăng dần
//    c. Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số
//    đó
//    d. Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo
//    tính sắp xếp tăng dần

    static ArrayList<Integer> list;
    static int n;

    public static void main(String[] args) {
        list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        nhap(scanner);
    }

    public static void nhap(Scanner scanner) {
        System.out.println("Phan a.");
        System.out.println("Nhap n = ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + " = ");
            list.add(scanner.nextInt());
        }
        System.out.println("Phan b.");
        printMax();
        System.out.println("Phan c.");
        sapXep();
        System.out.println(list);
        System.out.println("Phan c.");
        insertX(scanner);
        System.out.println(list);
    }

    public static void sapXep() {
        list.sort((a, b) -> a - b);
    }

    public static void printMax() {
        int max = list.get(0);
        int max2 = list.get(0);
        int psMax = 0;
        int psMax2 = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max2 = max;
                psMax2 = psMax;
                max = list.get(i);
                psMax = i;

            }

        }
        System.out.println("Phan tu lon nhat la " + max + " co chi so " + psMax + 1);
        System.out.println("Phan tu lon thu 2 la " + max2 + " co chi so " + psMax2 + 1);
    }

    public static void insertX(Scanner scanner) {
        System.out.println("Nhap x = ");
        int x = scanner.nextInt();
        for (int i = 0; i < list.size() - 1; i++) {
            if (x <= list.get(i + 1) && x >= list.get(i)) {
                list.add(i + 1, x);
                break;
            }
        }
    }
}
