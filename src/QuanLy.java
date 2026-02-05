import java.util.Scanner;
import java.util.ArrayList;
public class QuanLy {
    private ArrayList<NhanVien> danhSach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void themNV(NhanVien a) {
        danhSach.add(a);
    }
    public void hienThiDanhSachNV() {
        danhSach.stream()
                .forEach(b -> b.display());
    }
    public void timKiemNV() {
        System.out.print("Nhap Ma nhan vien ban muon tim: ");
        String timKiem = sc.nextLine();
        boolean timThay = false;
        for(NhanVien x : danhSach) {
            if(x.getMaNV().equalsIgnoreCase(timKiem)) {
                System.out.println("ket qua tim kiem: ");
                x.display();
                 timThay= true;
                 break;
            }
        }
        if(!timThay) {
            System.out.println("Khong tim thay nhan vien !!");
        }
    }
    public void danhSachNVluongCao() {
        System.out.println("NHUNG NV LUONG TREN 10TR : ");
        danhSach.stream()
                .filter(a -> a.tinhLuong() > 10000000)
                .forEach(a -> {
                   a.display();
                    System.out.printf("Luong: %,.0f VNĐ\n", a.tinhLuong());
                   System.out.println("------------------------------------");
                });

    }

}