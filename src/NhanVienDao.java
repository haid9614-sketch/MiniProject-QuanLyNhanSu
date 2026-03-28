import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.ArrayList;
public class NhanVienDao {
    public ArrayList hienThiToanBoNV() {
        Connection conn = Connector_SQL.ketNoi();
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "select * from nhan_vien";
        if(conn != null) {
            try(PreparedStatement pr = conn.prepareStatement(sql)) {
                try(ResultSet rs = pr.executeQuery()) {
                    while(rs.next()) {
                        String phanLoai = rs.getString("loai_NV");
                        if(phanLoai.equals("PartTime")) {
                            NhanVien nv1 = new PartTime(rs.getString("ten"), rs.getInt("tuoi"),
                                    rs.getInt("maNV"), rs.getDouble("luongCoBan"),
                                    rs.getInt("ngayLamViec"));
                            list.add(nv1);
                        } else {
                            NhanVien nv2 = new FullTime(rs.getString("ten"), rs.getInt("tuoi"),
                                    rs.getInt("maNV"), rs.getDouble("luongCoBan"),
                                    rs.getString("chucVu"), rs.getDouble("luongThuong"));
                            list.add(nv2);
                        }
                    }
                }
            } catch (SQLException e) {
                System.out.println("loi ket noi");
                e.printStackTrace();
            }

        }
        return list;
    }
}
