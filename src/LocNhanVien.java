import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
public class LocNhanVien {
    public ArrayList<NhanVien> locNhanVien(double loc) {
        ArrayList<NhanVien> listLoc = new ArrayList<>();
        Connection conn = Connector_SQL.ketNoi();
        String sql = "select * from nhan_vien";
        if(conn != null) {
           try(PreparedStatement pr = conn.prepareStatement(sql)) {
              try(ResultSet rs = pr.executeQuery()) {
                 while(rs.next()) {
                     String loaiNV = rs.getString("loai_NV");
                     if(loaiNV.equals("PartTime")) {
                         NhanVien nv1 = new PartTime(rs.getString("ten"), rs.getInt("tuoi"),
                                 rs.getInt("maNV"), rs.getDouble("luongCoBan"),
                                 rs.getInt("ngayLamViec"));
                          if(nv1.tinhLuong() > loc) {
                              listLoc.add(nv1);
                          }
                     } else {
                         NhanVien nv2 = new FullTime(rs.getString("ten"), rs.getInt("tuoi"),
                                 rs.getInt("maNV"), rs.getDouble("luongCoBan"),
                                 rs.getString("chucVu"), rs.getDouble("luongThuong"));
                          if(nv2.tinhLuong() > loc) {
                              listLoc.add(nv2);
                          }
                     }
                 }
              }
           } catch (SQLException e) {
               System.out.println("LOI KET NOI");
               e.printStackTrace();
           }
        }
        return listLoc;
    }
}
