package dao;

import connectdb.ConnectDB;
import entity.KhachHang;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.lang.Boolean;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class KhachHang_DAO {
    private ArrayList<KhachHang> DSKH = new ArrayList<>();

    public ArrayList<KhachHang> getDSKH() {
        return DSKH;
    }
    
    public ArrayList<KhachHang> layDanhSachKhachHang() throws SQLException{
        ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "SELECT * FROM KhachHang";
		Statement stmt = con.createStatement();
		//Thuc thi cau lenh SQL tra ve doi tuong ResultSet
		ResultSet rs = stmt.executeQuery(sql);
		//Duyet tren tung ket qua tra ve
		while (rs.next()) {
                    String maKH = rs.getString(1);
                    String tenKH = rs.getString(2);
                    String gioiTinh = rs.getString(3);
                    Date ngaySinh = rs.getDate(4);
                    String soDT = rs.getString(5);
                    String soCCCD = rs.getString(6);
                    String diaChi = rs.getString(7);                 
                    KhachHang kh = new KhachHang(maKH,tenKH,gioiTinh,ngaySinh,soDT,soCCCD,diaChi);
                    DSKH.add(kh);
                }
           return DSKH;
    }
    public boolean themKhachHang(KhachHang kh)
	{
		//ket noi ConnectDB
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n =0;
		String sql ="INSERT INTO KhachHang (MaKhachHang, TenKhachHang, GioiTinh, NgaySinh, SoDT, SoCCCD, DiaChi) VALUES(?,?,?,?,?,?,?)";             
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1,kh.getMaKhachHang());
			stmt.setString(2, kh.getTenKhachHang());
			stmt.setString(3, kh.getGioiTinh());
			stmt.setDate(4, (Date) kh.getNgaySinh());
			stmt.setString(5, kh.getSoDT());
			stmt.setString(6, kh.getSoCCCD());
			stmt.setString(7, kh.getDiaChi());
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return n > 0;
	}
    
    public KhachHang timNhanVienTheoMaKH(String maKH)
	{
		//ket noi 
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		KhachHang kh = null;
		try {
			String sql = "SELECT * FROM NhanVien WHERE MaKhachHang=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, maKH);
			//thuc thi cau lenh sql tra ve doi tuong ResultSet
			ResultSet rs = stmt.executeQuery();
			//Duyet tren ket qua tra ve
			while(rs.next())
			{
				String ma = rs.getString(1);
				String ten = rs.getString(2);
				String gioiTinh = rs.getString(3);
				Date ngaySinh = rs.getDate(4);
				String soDT = rs.getString(5);
				String soCCCD = rs.getString(6);
				String diaChi = rs.getString(7);
				
				kh = new KhachHang(ma, ten, gioiTinh, ngaySinh, soDT, soCCCD, diaChi);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return kh;
	}
}
