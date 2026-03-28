import java.util.Scanner;
import java.util.ArrayList;
public class QuanLy {
    Scanner sc = new Scanner(System.in);
    public void hienThiNV_main() {
        NhanVienDao dao = new NhanVienDao();
        ArrayList<NhanVien> list = dao.hienThiToanBoNV();
        for(NhanVien x : list) {
            x.display();
        }
    }
    public void themNV_PartTime_main() {
        ThemNhanVien them = new ThemNhanVien();
       System.out.println("VUI LONG NHAP THONG TIN NHAN VIEN BAN MUON THEM: ");
       System.out.print("nhap ma nhan vien(int): ");
       int maNV = Integer.parseInt(sc.nextLine());
       System.out.print("nhap ten nhan vien(STring): ");
       String ten = sc.nextLine();
       System.out.print("nhap tuoi nhan vien(int): ");
       int tuoi = Integer.parseInt(sc.nextLine());
       System.out.print("nhap luong co ban nv(double): ");
       double luongCoBan = Double.parseDouble(sc.nextLine());
       System.out.print("nhap so ngay lam viec(int): ");
       int ngayLamViec = Integer.parseInt(sc.nextLine());
       them.themNhanVienPartTime(maNV, ten, tuoi, luongCoBan, ngayLamViec);
    }
    public void themNV_FullTime_main() {
        ThemNhanVien them = new ThemNhanVien();
        System.out.println("VUI LONG NHAP THONG TIN NHAN VIEN BAN MUON THEM: ");
        System.out.print("nhap ma nhan vien(int): ");
        int maNV = Integer.parseInt(sc.nextLine());
        System.out.print("nhap ten nhan vien(STring): ");
        String ten = sc.nextLine();
        System.out.print("nhap tuoi nhan vien(int): ");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("nhap luong co ban nv(double): ");
        double luongCoBan = Double.parseDouble(sc.nextLine());
        System.out.print("nhap chuc vu(String): ");
        String chucVu = sc.nextLine();
        System.out.print("nhap luong thuong(double): ");
        double luongThuong = Double.parseDouble(sc.nextLine());
        them.themNhanVienFullTime(maNV, ten, tuoi,luongCoBan, chucVu, luongThuong);

    }
    public void timKiemNV_main() {
        TimKiemNhanVien tk = new TimKiemNhanVien();
        System.out.print("nhap ma nhan vien ban muon tim: ");
        int ma = Integer.parseInt(sc.nextLine());
        tk.timKiemNV(ma);
    }
    public void locNV_main() {
        LocNhanVien loc = new LocNhanVien();
        System.out.print("nhap muc luong muon loc: ");
        double luong = Double.parseDouble(sc.nextLine());
        ArrayList<NhanVien> list = loc.locNhanVien(luong);
        System.out.println("CAC NHAN VIEN SAU KHI LOC LA:");
        for(NhanVien x : list) {
            x.display();
            System.out.printf("Luong: %,.0f VNĐ\n", x.tinhLuong());
        }
    }
    public void xoaNV_main() {
        XoaNhanVien xnv = new XoaNhanVien();
        System.out.print(" nhap ma NV ban muon xoa: ");
        int maNV = Integer.parseInt(sc.nextLine());
        xnv.xoaNV(maNV);
    }


}
   // code cũ khi chưa kết nối
    // private ArrayList<NhanVien> danhSach = new ArrayList<>();
    // Scanner sc = new Scanner(System.in);
    //public void themNV(NhanVien a) {
    //    danhSach.add(a);
    // }
   // public void hienThiDanhSachNV() {
     //   danhSach.stream()
      //          .forEach(b -> b.display());
    // }
   // public void timKiemNV() {
     //   System.out.print("Nhap Ma nhan vien ban muon tim: ");
       // int timKiem = sc.nextInt();
        //boolean timThay = false;
        // for(NhanVien x : danhSach) {
           // if(x.getMaNV() == timKiem) {
             //   System.out.println("ket qua tim kiem: ");
             //   x.display();
             //    timThay= true;
             //    break;
           // }
       // }
       // if(!timThay) {
         //   System.out.println("Khong tim thay nhan vien !!");
       // }
    // }
    // public void danhSachNVluongCao() {
     //System.out.println("NHUNG NV LUONG TREN 10TR : ");
       // danhSach.stream()
              //  .filter(a -> a.tinhLuong() > 10000000)
                //.forEach(a -> {
                  // a.display();
                   // System.out.printf("Luong: %,.0f VNĐ\n", a.tinhLuong());
                   //System.out.println("------------------------------------");
                // });



