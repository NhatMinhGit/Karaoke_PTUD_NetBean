/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectdb.ConnectDB;
import entity.DichVu;
import entity.LoaiPhong;
import entity.Phong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ad
 */
public class DichVu_DAO {
	public ArrayList<DichVu> getAllDichVu() throws SQLException
	{
            
		ArrayList<DichVu> dsDV = new ArrayList<>();
		
			//ket noi
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "SELECT * FROM DichVu";
			Statement stmt = con.createStatement();
			//Thuc thi cau lenh SQL tra ve doi tuong ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			//Duyet tren tung ket qua tra ve
			while(rs.next())
			{
                                DichVu dv = new DichVu();
                                dv.setMaDV(rs.getString(1));
				dv.setTenDV(rs.getString(2));
				dv.setSoLuong(rs.getInt(3));
                                dv.setGiaBan(rs.getDouble(4));
				dv.setDonViTinh(rs.getString(5));
                                dv.setTrangThaiDV(rs.getBoolean(6));
				dsDV.add(dv);      
			}
            
            return dsDV;
	}
        public boolean themDichVu(DichVu x)
	{
		//ket noi ConnectDB
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n =0;
		String sql ="INSERT INTO DichVu(MaDichVu,TenDichVu,SoLuongDichVu,GiaBan,DonViTinh,trangThaiDichVu) VALUES(?,?,?,?,?,?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1,x.getMaDV());
			stmt.setString(2, x.getTenDV());
			stmt.setInt(3, x.getSoLuong());
                        stmt.setDouble(4, x.getGiaBan());
			stmt.setString(5, x.getDonViTinh());
                        stmt.setBoolean(6, x.isTrangThaiDV());
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
//        public ArrayList<Phong> locDichVu(String maLP,String trangThaiP,)
//		{
//			ArrayList<Phong> dsp = new ArrayList<Phong>();
//			//ket noi 
//			ConnectDB.getInstance();
//			Connection con = ConnectDB.getConnection();
//			PreparedStatement stmt = null;
//			try {
//				String sql = "SELECT * FROM Phong WHERE MaLP =? TrangThaiPhong=?";
//				stmt = con.prepareStatement(sql);
//				stmt.setString(2, maLP);
//                                stmt.setString(6, trangThaiP);
//				//thuc thi cau lenh sql tra ve doi tuong ResultSet
//				ResultSet rs = stmt.executeQuery();
//				//Duyet tren ket qua tra ve
//				while(rs.next())
//				{
//					String maDichVu = rs.getString(1);
//                                        String tenDichVu = rs.getString(2);
//                                        int soLuongDV = rs.getInt(3);
//                                        double giaBan = rs.getDouble(4);
//                                        String donViTinh = rs.getString(5);
//					Boolean trangThaiDV = rs.getBoolean(6);
//					
//                                        
//					String trangThaiPhong = rs.getString(6);
//					
//					DichVu x = new DichVu(maDichVu,tenDichVu, soLuongDV,giaBan, donViTinh,trangThaiDV);
//					
//					//them nv x vao dsnv
//					dsp.add(x);
//				}
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			finally {
//				try {
//					stmt.close();
//				} catch (Exception e2) {
//					e2.printStackTrace();
//				}
//			}
//			return dsp;
//		}
//        
}
