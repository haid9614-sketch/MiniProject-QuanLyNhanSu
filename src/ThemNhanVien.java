import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
public class ThemNhanVien {
    public void themNhanVienPartTime(int maNV, String ten, int tuoi, double luongCoBan, int ngayLamViec) {
        Connection conn = Connector_SQL.ketNoi();
       String sql = "insert into nhan_vien (maNV, loai_NV, ten, tuoi, luongCoBan, ngayLamViec) values (?, ?, ?, ?, ?, ?)";
       if(conn != null) {
           try(PreparedStatement pr = conn.prepareStatement(sql)) {
               pr.setInt(1, maNV);
               pr.setString(2, "PartTime");
               pr.setString(3, ten);
               pr.setInt(4, tuoi);
               pr.setDouble(5, luongCoBan);
               pr.setInt(6, ngayLamViec);
               int row = pr.executeUpdate();
               if(row >= 0) {
                   System.out.println("DA THEM NHAN VIEN THANH CONG !!! ");
               } else {
                   System.out.println(" THAT BAI !!!");
               }
           } catch (SQLException e) {
               System.out.println("loi ket noi !!!");
               e.printStackTrace();
           }

       }
    }
    public void themNhanVienFullTime(int maNV, String ten, int tuoi, double luongCoBan, String chucVu,
                                     double luongThuong) {
        Connection conn = Connector_SQL.ketNoi();
        String sql = "insert into nhan_vien (maNV, loai_NV, ten, tuoi, luongCoBan, chucVu, luongThuong) values (?, ?, ?, ?, ?, ?, ?)";
        if(conn != null) {
            try(PreparedStatement pr = conn.prepareStatement(sql)) {
                pr.setInt(1, maNV);
                pr.setString(2, "FullTime");
                pr.setString(3, ten);
                pr.setInt(4, tuoi);
                pr.setDouble(5, luongCoBan);
                pr.setString(6, chucVu);
                pr.setDouble(7, luongThuong);
                int row = pr.executeUpdate();
                if(row >= 0) {
                    System.out.println("DA THEM NHAN VIEN THANH CONG !!! ");
                } else {
                    System.out.println(" THAT BAI !!!");
                }
            } catch (SQLException e) {
                System.out.println("loi ket noi !!!");
                e.printStackTrace();
            }

        }
    }
}
