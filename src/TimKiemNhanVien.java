import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
public class TimKiemNhanVien {
    public void timKiemNV(int maNV) {
        Connection conn = Connector_SQL.ketNoi();
        String sql = "select * from nhan_vien where maNV = ?";
        if(conn != null) {
            try(PreparedStatement pr = conn.prepareStatement(sql)) {
                pr.setInt(1, maNV);
                try(ResultSet rs = pr.executeQuery()) {
                    while(rs.next()) {
                        int ma = rs.getInt("maNV");
                        String loaiNV = rs.getString("loai_NV");
                        boolean co = false;
                        if(ma == maNV) {
                            if(loaiNV.equals("PartTime")) {
                                NhanVien nv1 = new PartTime(rs.getString("ten"), rs.getInt("tuoi"),
                                        ma, rs.getDouble("luongCoBan"),
                                        rs.getInt("ngayLamViec"));
                                       nv1.display();
                            } else {
                                NhanVien nv2 = new FullTime(rs.getString("ten"), rs.getInt("tuoi"),
                                        ma, rs.getDouble("luongCoBan"),
                                        rs.getString("chucVu"), rs.getDouble("luongThuong"));
                                        nv2.display();
                                }
                             co = true;
                        }
                        if(!co) {
                            System.out.println("KHONG TIM THAY NHAN VIEN");
                        }
                    }
                }

            } catch (SQLException e) {
                System.out.println("loi ket noi");
                e.printStackTrace();
            }

        }
    }
}
