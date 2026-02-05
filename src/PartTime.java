public class PartTime extends NhanVien {
    private int ngayLamViec;
    public PartTime(String ten, int tuoi, String maNV, double luongCoBan, int ngayLamViec) {
        super(ten, tuoi, maNV, luongCoBan);
        this.ngayLamViec = ngayLamViec;
    }
    @Override
    public void display() {
        System.out.println(" thong tin nhan vien partTime la: ");
        super.display();
        System.out.println("so ngay lam viec: " + this.ngayLamViec);
    }
    @Override
    public double tinhLuong() {
        return this.ngayLamViec * getLuongCoBan();
    }

}
