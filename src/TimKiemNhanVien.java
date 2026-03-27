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
                        boolean co = false;
                        if(ma == maNV) {


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
