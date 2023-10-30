/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectdb.ConnectDB;
import entity.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author ad
 */
public class HoaDon_DAO {

    public HoaDon_DAO() {
    }
    
public ArrayList<HoaDon> getAllHoaDon()
{
    ArrayList<HoaDon> dshd = new ArrayList<HoaDon>();
	try {
            //ket noi connectDB
            ConnectDB.getInstance();//de lay mot doi tuong ConnectDB da duoc khoi tao truoc do
            Connection con = ConnectDB.getConnection();//lay mot doit tuong da ket noi den sql
            String sql = "SELECT * FROM HoaDon";
            Statement sttm = con.createStatement();//tao doi tuong sttm de truy van sql
            //thuc thi cau lenh sql tra ve doi tuong resultSet
            ResultSet rs = sttm.executeQuery(sql);
            // Duyet tren ket qua tra ve
            while(rs.next())//di chuyen con tro xuong nhung ban ghi ke tiep
            {
		String maHD = rs.getString(1);
		Date ngayLapHD = rs.getDate(2);
		Date gioTraPhong = rs.getDate(3);
		//float tongTien
                boolean trangThaiTT = rs.getBoolean(4);
				
		HoaDon x = new HoaDon(maHD, ngayLapHD, gioTraPhong,trangThaiTT);
				
		//them nv x vao dsnv
		dshd.add(x);
            }
        } catch (Exception e) {
		e.printStackTrace();
	}
        return dshd;
}
	
	//them nhanVien kieu boolean truyen vao mot nhan vien
	public boolean themNhanVien(HoaDon x)
	{
		//ket noi ConnectDB
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n =0;
		String sql ="insert into NhanVien(MaHoaDon,NgayLapHD date,GioTraPhong,TrangThaiThanhToan) VALUES(?,?,?,?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1,x.getMaHD());
			stmt.setDate(2, (Date) x.getNgayLapHD());
                        stmt.setDate(3, (Date) x.getGioTraPhong());
			stmt.setBoolean(4, x.isTrangThaiTT());
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
	
}
