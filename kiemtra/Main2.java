package kiemtra;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KyThuat kt1 = new KyThuat("TP1234","Khanh","28/12/1999","Thanh Hoa","Pro1");
        KyThuat kt2 = new KyThuat("TP5678");
        System.out.print("Nhap ten:");
        kt2.setName(scanner.nextLine());
        System.out.print("Nhap ngay sinh theo dang ngay/thang/nam:");
        kt2.setDob(scanner.nextLine());
        System.out.print("Nhap dia chi:");
        kt2.setAddress(scanner.nextLine());
        System.out.print("Nhap chuyen nganh:");
        kt2.setMajor(scanner.nextLine());
        System.out.println(kt1.toString());
        System.out.println(kt2.toString());
    }
}
