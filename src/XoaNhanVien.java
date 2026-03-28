import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class XoaNhanVien {
    public void xoaNV(int maNV) {
        Connection conn = Connector_SQL.ketNoi();
        String sql = "delete from nhan_vien where maNV = ?";
        if(conn != null) {
            try (PreparedStatement pr = conn.prepareStatement(sql)) {
                pr.setInt(1, maNV);
                int row = pr.executeUpdate();
                if(row > 0) {
                    System.out.println("da xoa nhan vien thanh cong !!!!");
                } else {
                    System.out.println("loi khong xoa duoc nhan vien");
                }
            } catch (SQLException e) {
                System.out.println("loi ket noi");
                e.printStackTrace();
            }
        }
    }
}
