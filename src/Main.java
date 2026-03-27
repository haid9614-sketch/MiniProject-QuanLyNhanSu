import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("-------------------------------------------------");
            System.out.println("-------------------------------------------------");
            System.out.println("BAN DANG O TRANG QUAN LY!!");
            System.out.println("1. hien thi danh sach NV");
            System.out.println("2. hien thi sanh sanh NV luong tren 10TR");
            System.out.println("3. tim kiem nhan vien ");
            System.out.println("0. dong chuong trinh");
            System.out.println("-------------------------------------------------------------");
            System.out.print("nhap lua chon cua ban: ");
            Scanner sc = new Scanner(System.in);
            String luaChon = sc.nextLine();
            int choice = Integer.parseInt(luaChon);
            switch(choice) {
                case 1:
                    ql1.hienThiDanhSachNV();
                    break;
                case 2:
                    ql1.danhSachNVluongCao();
                    break;
                case 3:
                    ql1.timKiemNV();
                    break;
                case 0:
                    System.exit(0);
                    System.out.println("chuc nang khong hop le");
            }

        }
    }
}
