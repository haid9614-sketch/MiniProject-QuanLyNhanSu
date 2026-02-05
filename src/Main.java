import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql1 = new QuanLy();
        NhanVien nv1 = new PartTime("duong", 18, "101", 120000, 16);
        NhanVien nv2 = new PartTime("han", 19, "102", 130000, 18);
        NhanVien nv3 = new PartTime("khoa", 18, "103", 350000, 30);
        NhanVien nv4 = new FullTime("truong", 20, "104",
                8400000, "quanLy", 2.5, 2000000);
        NhanVien nv5 = new FullTime("minh", 21, "105",
                8670000, "quanLyThongTin", 3.0, 3000000);
        NhanVien nv6 = new FullTime("Nhan", 25, "106",
                9400023, "quanLyNV", 1.6, 1000000);
        ql1.themNV(nv1);
        ql1.themNV(nv2);
        ql1.themNV(nv3);
        ql1.themNV(nv4);
        ql1.themNV(nv5);
        ql1.themNV(nv6);
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
                default:
                    System.out.println("chuc nang khong hop le");
            }

        }
    }
}
