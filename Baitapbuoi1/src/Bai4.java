import java.util.Scanner;

// Nguyễn Khắc Tài - CT030147

public class Bai4 {
    //    Nhập ma trận A gồm n dòng, m cột, các phần tử là những số nguyên lớn hơn
//    0 và nhỏ hơn 100 được nhập từ bàn phím. Thực hiện các chức năng sau:
//    a. Tìm phần tử lớn nhất của ma trận cùng chỉ số của số đó
//    b. Tìm và in ra các phần tử là số nguyên tố của ma trận (các phần tử không là
//            nguyên tố thì thay bằng 0)
//    c. Sắp xếp tất cả các cột của ma trận theo thứ tự tăng dần và in kết quả
    static int[][] list;
    static int n, m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nhapMang(scanner);
        System.out.println("Phan a.");
        findMax();
        System.out.println("Phan b.");
        printSNT();
        System.out.println("Phan c.");
        sapXep();
        inMang();
    }

    public static int nhapSo(Scanner scanner, int i, int j) {
        System.out.println("Nhap phan tu " + (i + 1) + "-" + (j + 1));
        int a = scanner.nextInt();
        while (a <= 0 || a >= 100) {
            System.out.println("Nhap so 0<n<100 !");
            a = scanner.nextInt();
        }
        return a;
    }

    public static void nhapMang(Scanner scanner) {
        System.out.println("Nhap n = ");
        n = scanner.nextInt();
        System.out.println("Nhap m = ");
        m = scanner.nextInt();
        list = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list[i][j] = nhapSo(scanner, i, j);
            }
        }

    }

    public static void findMax() {
        int max = list[0][0];
        int pn = 0;
        int pm = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < list[i][j]) {
                    max = list[i][j];
                    pn = i;
                    pm = j;
                }
            }

        }
        System.out.println("Max = " + max + " tai vi tri " + (pn + 1) + "-" + (pm + 1));
    }

    public static void printSNT() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ktraSoNguyenTo(list[i][j]) ? (list[i][j] + " ") : "0 ");
            }
            System.out.println();

        }
    }

    public static boolean ktraSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        boolean snt = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                snt = false;
                break;
            }
        }
        return snt;
    }

    public static void sapXep() {
        for (int a = 0; a < m; a++) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n - i; j++) {
                    if (list[j - 1][a] > list[j][a]) {
                        int tg = list[j - 1][a];
                        list[j - 1][a] = list[j][a];
                        list[j][a] = tg;
                    }
                }
            }
        }
    }

    public static void inMang() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}
