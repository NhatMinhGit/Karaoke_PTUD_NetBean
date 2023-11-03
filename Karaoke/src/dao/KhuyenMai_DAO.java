
package dao;

import connectdb.ConnectDB;
import entity.KhuyenMai;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class KhuyenMai_DAO {
    private ArrayList<KhuyenMai> DSKM = new ArrayList<>();

    public ArrayList<KhuyenMai> getDSKM() {
        return DSKM;
    }
    
    public ArrayList<KhuyenMai> layDanhSachKhuyenMai() throws SQLException{
        ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "SELECT * FROM KhuyenMai";
		Statement stmt = con.createStatement();
		//Thuc thi cau lenh SQL tra ve doi tuong ResultSet
		ResultSet rs = stmt.executeQuery(sql);
		//Duyet tren tung ket qua tra ve
		while (rs.next()) {
                    String maKM = rs.getString(1);
                    String maGG = rs.getString(2);
                    Double chietKhau = rs.getDouble(3);
                    int soLuong = rs.getInt(4);
                    Date ngayBD = rs.getDate(5);
                    Date ngayKT = rs.getDate(6);
                    String moTa = rs.getString(7);                 
                    KhuyenMai km = new KhuyenMai(maKM,maGG, chietKhau, soLuong, ngayBD, ngayKT, moTa);
                    DSKM.add(km);
                }
           return DSKM;
    } 
}
