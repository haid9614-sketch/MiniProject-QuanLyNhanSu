public class FullTime extends NhanVien {
    private String chucVu;
    private double heSo;
    private double luongThuong;
    public FullTime(String ten, int tuoi, String maNV,
                    double luongCoBan, String chucVu, double heSo, double luongThuong) {
        super(ten, tuoi, maNV, luongCoBan);
        this.chucVu = chucVu;
        this.heSo = heSo;
        this.luongThuong = luongThuong;
    }
    @Override
    public void display() {
        System.out.println("thong tin nhan vien fullTime la: ");
        super.display();
        System.out.println("chuc vu: " + this.chucVu);
        System.out.println("luong thuong: " + this.luongThuong);
    }
    @Override
    public double tinhLuong() {
        double a = (getLuongCoBan() * this.heSo) + luongThuong;
        return a;
    }
}
