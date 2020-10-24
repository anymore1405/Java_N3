import java.util.Scanner;

// Nguyễn Khắc Tài - CT030147

public class Bai2 {

//    Dùng hàm thực hiện các chương trình sau
//    a. Nhập vào 1 số nguyên dương n (n &gt; 0).Viết hàm kiểm tra n có phải là
//    nguyên tố không? (số nguyên tố là số tự nhiên khác 0 chỉ có hai ước số dương
//    phân biệt là 1 và chính nó, số 1 không là số nguyên tố)
//    b. In ra các số nguyên tố &lt; n
//    c. Nhập vào 1 số nguyên dương n (n &gt; 0). Viết hàm kiểm tra n có là số
//    hoàn hảo không? (số hoàn hảo là số có tổng các ước = chính nó)
//    d. In ra các số hoàn hảo &lt; n
//    e. Nhập vào 2 số nguyên dương a, b. Viết hàm tìm USCLN của hai số
//    nguyên a, b.
//    f. Nhập vào 2 số nguyên tương ứng là tử số và mẫu số của phần số, in ra
//    màn hình phân số tối giản.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        phanABCD(scanner);
        phanE(scanner);
        phanF(scanner);
    }

    public static void phanABCD(Scanner scanner) {
        System.out.println("Phan a.");
        System.out.println("Nhap so n = ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("So n phai lon hon 0!");
            n = scanner.nextInt();
        }
        System.out.println(ktraSoNguyenTo(n) ? (n + " la so nguyen to") : (n + " khong la so nguyen to"));
        System.out.println("Phan b.");
        System.out.println("Cac so nguyen to nho hon " + n + " la:");
        inSoNguyenTo(n);
        System.out.println("Phan c.");
        System.out.println(ktraSoHoanHao(n) ? (n + " la so hoan hao") : (n + " khong la so hoan hao"));
        System.out.println("Phan d.");
        System.out.println("Cac so hoan hao nho hon " + n + " la:");
        inSoHoanHao(n);
    }

    public static void phanE(Scanner scanner) {
        System.out.println("Phan e.");
        System.out.println("Nhap so a = ");
        int a = scanner.nextInt();
        while (a <= 0) {
            System.out.println("So a phai lon hon 0!");
            a = scanner.nextInt();
        }
        System.out.println("Nhap so b = ");
        int b = scanner.nextInt();
        while (b <= 0) {
            System.out.println("So b phai lon hon 0!");
            b = scanner.nextInt();
        }
        System.out.println("UCLN la: " + ucln(a, b));

    }

    public static void phanF(Scanner scanner) {
        System.out.println("Phan f.");
        System.out.println("Nhap tu so: ");
        int ts = scanner.nextInt();
        if (ts == 0) {
            System.out.println("Phan so toi gian la: " + 0);
        } else {
            System.out.println("Nhap mau so: ");
            int ms = scanner.nextInt();
            while (ms == 0) {
                System.out.println("So ms phai khac 0!");
                ms = scanner.nextInt();
            }
            System.out.println("Phan so toi gian la: " + psToiGian(ts, ms));
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

    public static void inSoNguyenTo(int n) {
        for (int i = 2; i < n; i++) {
            if (ktraSoNguyenTo(i)) {
                System.out.println(i + "");
            }
        }
    }

    public static boolean ktraSoHoanHao(int n) {
        if (n <= 0) {
            System.out.println("So n khong hop le!");
            return false;
        }
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) tong += i;
        }
        return tong == n;
    }

    public static void inSoHoanHao(int n) {
        for (int i = 1; i < n; i++) {
            if (ktraSoHoanHao(i)) System.out.println("" + i);
        }
    }

    public static int ucln(int a, int b) {
        int tg;
        while (a % b != 0) {
            tg = b;
            b = a % b;
            a = tg;
        }
        return b;
    }

    public static String psToiGian(int ts, int ms) {
        int uoc = ucln(ts, ms);
        return ts / uoc + "/" + ms / uoc;
    }
}
