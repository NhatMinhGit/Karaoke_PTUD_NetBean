/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectdb.ConnectDB;
import entity.KhachHang;
import entity.LoaiPhong;
import entity.NhanVien;
import entity.PhieuDatPhong;
import entity.Phong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ad
 */
public class PhieuDatPhong_DAO {
    public PhieuDatPhong_DAO() 
        {
        }
        
        public ArrayList<PhieuDatPhong> getAllPhieuDatPhong() throws SQLException
	{
            
		ArrayList<PhieuDatPhong> dsPDP = new ArrayList<PhieuDatPhong>();
		
			//ket noi
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "SELECT * FROM PhieuDatPhong";
			Statement stmt = con.createStatement();
			//Thuc thi cau lenh SQL tra ve doi tuong ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			//Duyet tren tung ket qua tra ve
			while(rs.next())
			{
                                String maPDP = rs.getString(1);
                                Phong maP = new Phong(rs.getString(2));
				KhachHang maKH = new KhachHang(rs.getString(3));
				NhanVien maNV = new NhanVien(rs.getString(4));
                                String ngayDatPhong = rs.getDate(5).toString();
				PhieuDatPhong pdp = new PhieuDatPhong(maPDP,maP ,maKH, maNV,ngayDatPhong);
				dsPDP.add( pdp);    
			}
            
            return dsPDP;
	}
        public boolean themPhieuDatPhong(PhieuDatPhong x)
	{
		//ket noi ConnectDB
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n =0;
		String sql ="INSERT INTO PhieuDatPhong(MaPhieuDatPhong, MaP, MaKH, MaNV,NgayDatPhong) VALUES(?,?,?,?,?) update Phong set TrangThaiPhong=N'Đầy' where MaPhong=?";
		try {
			stmt = con.prepareStatement(sql);
                        stmt.setString(1,x.getMaPhieuDatPhong());
			stmt.setString(2,x.getPhong().getMaPhong());
                        stmt.setString(2, x.getKhachHang().getMaKhachHang());
			stmt.setString(3, x.getNhanVien().getMaNhanVien());
			stmt.setString(4, x.getNgayDatPhong());
                        stmt.setString(5,x.getPhong().getMaPhong());
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
                String sql2 ="Update Phong set TrangThaiPhong=N'Đầy' where MaPhong=?";
		try {
			stmt = con.prepareStatement(sql2);
                        stmt.setString(1,x.getPhong().getMaPhong());
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
