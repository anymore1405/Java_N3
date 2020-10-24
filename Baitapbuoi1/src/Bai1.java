import java.util.Date;
import java.util.Scanner;

// Nguyễn Khắc Tài - CT030147

public class Bai1 {

//    Dùng hàm viết chương trình nhập vào một ngày tháng năm. tìm ngày tháng năm
//    kế tiếp

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ngay = ");
        int ngay = scanner.nextInt();
        System.out.println("Nhap thang = ");
        int thang = scanner.nextInt();
        System.out.println("Nhap nam = ");
        int nam = scanner.nextInt();
        Date date = new Date();
        date.setDate(ngay);
        date.setMonth(thang);
        date.setYear(nam);
        date.setDate(ngay+1);
        String chuoi = date.getDate()+"/" + date.getMonth()+ "/" + date.getYear();
        System.out.println("Ngay thang nam tiep theo la: "+ chuoi);
    }
}
