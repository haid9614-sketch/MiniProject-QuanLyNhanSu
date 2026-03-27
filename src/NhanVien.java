public abstract class NhanVien {
    protected String ten;
    protected int tuoi;
    protected int maNV;
    protected Double luongCoBan;
    public NhanVien(String ten, int tuoi, int maNV, Double luongCoBan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.maNV = maNV;
        this.luongCoBan = luongCoBan;
    }
    public int getMaNV() {
        return this.maNV;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public void display() {
        System.out.println("ten: " + this.ten + " | tuoi: " + this.tuoi + " | namSinh: "
                + " | maNV: " + this.maNV + " | luongCoBan: " + this.luongCoBan);
    }
    public abstract double tinhLuong();

}
