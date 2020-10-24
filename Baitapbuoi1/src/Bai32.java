import java.util.Scanner;

// Nguyễn Khắc Tài - CT030147

public class Bai32 {
    //    Viết chương trình cho phép nhập vào 1 chuỗi. Yêu cầu xuất ra:
//        - Bao nhiêu chữ IN HOA
//        - Bao nhiêu chữ in thường
//        - Bao nhiêu chữ là chữ số
//        - Bao nhiêu chữ là ký tự đặc biệt
//        - Bao nhiêu chữ là khoảng trắng
    static String s;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nhap(scanner);
        System.out.println("Co " + inThuong() + " ky tu in thuong");
        System.out.println("Co " + inHoa() + " ky tu in hoa");
        System.out.println("Co " + so() + " chu so");
        System.out.println("Co " + kyTuDacBiet() + " ky tu dac biet");
        System.out.println("Co " + khoangTrang() + " khoang trang");
    }

    public static void nhap(Scanner scanner) {
        System.out.println("Nhap chuoi: ");
        s = scanner.nextLine();
    }

    public static int find(char start, char end) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= end && s.charAt(i) >= start) count++;
        }
        return count;
    }

    public static int inHoa() {
        return find('A', 'Z');
    }

    public static int inThuong() {
        return find('a', 'z');
    }

    public static int so() {
        return find('0', '9');
    }

    public static int khoangTrang() {
        return find(' ', ' ');
    }

    public static int kyTuDacBiet() {
        return s.length() - inHoa() - inThuong() - so() - khoangTrang();
    }
}
