import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QuanLy ql1 = new QuanLy();
        while(true) {
            System.out.println("-------------------------------------------------");
            System.out.println("-------------------------------------------------");
            System.out.println("BAN DANG O TRANG QUAN LY!!");
            System.out.println("1. hien thi danh sach NV");
            System.out.println("2. Them nhan vien PartTime");
            System.out.println("3. them nhan vien FullTime");
            System.out.println("4. tim kiem nhan vien ");
            System.out.println("5. loc nhan vien theo luong");
            System.out.println("6. xoa nhan vien");
            System.out.println("0. dong chuong trinh");
            System.out.println("-------------------------------------------------------------");
            System.out.print("nhap lua chon cua ban: ");
            Scanner sc = new Scanner(System.in);
            String luaChon = sc.nextLine();
            int choice = Integer.parseInt(luaChon);
            switch(choice) {
                case 1:
                    ql1.hienThiNV_main();
                    break;
                case 2:
                    ql1.themNV_PartTime_main();
                    break;
                case 3:
                    ql1.themNV_FullTime_main();
                    break;
                case 4:
                    ql1.timKiemNV_main();
                    break;
                case 5:
                    ql1.locNV_main();
                    break;
                case 6:
                    ql1.xoaNV_main();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("chuc nang khong hop le");
            }

        }
    }
}
