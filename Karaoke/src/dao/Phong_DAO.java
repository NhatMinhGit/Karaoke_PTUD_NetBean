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
public class Phong_DAO {

        public Phong_DAO() 
        {
        }
        
        public ArrayList<Phong> getAllPhong() throws SQLException
	{
            
		ArrayList<Phong> dsP = new ArrayList<Phong>();
		
			//ket noi
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "SELECT * FROM Phong";
			Statement stmt = con.createStatement();
			//Thuc thi cau lenh SQL tra ve doi tuong ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			//Duyet tren tung ket qua tra ve
			while(rs.next())
			{
                                String maP = rs.getString(1);
                                LoaiPhong tenLP = new LoaiPhong(rs.getString(2));
				String tenP = rs.getString(3);
				float giaP = rs.getFloat(4);
                                int soNguoiToiDa = rs.getInt(5);
				String trangThaiP = rs.getString(6);
				Phong p = new Phong(maP ,tenLP, tenP,giaP, soNguoiToiDa,trangThaiP );
				dsP.add( p);    
			}
            
            return dsP;
	}
        public boolean themPhong(Phong x)
	{
		//ket noi ConnectDB
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n =0;
		String sql ="INSERT INTO Phong(MaPhong, MaLP, TenPhong, GiaPhong, SoNguoiToiDa,TrangThaiPhong) VALUES(?,?,?,?,?,?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1,x.getMaPhong());
                        stmt.setString(2, x.getLoaiPhong().getTenLoaiPhong());
			stmt.setString(3, x.getTenPhong());
                        stmt.setFloat(4, x.getGiaPhong());
                        stmt.setInt(5, x.getSoNguoiToiDa());
			stmt.setString(6, x.getTrangThaiPhong());
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
        public ArrayList<Phong> locPhong(String maLP,String trangThaiP)
		{
			ArrayList<Phong> dsp = new ArrayList<Phong>();
			//ket noi 
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			PreparedStatement stmt = null;
			try {
				String sql = "SELECT * FROM Phong WHERE MaLP =? and TrangThaiPhong=?";
				stmt = con.prepareStatement(sql);
				stmt.setString(1, maLP);
                                stmt.setString(2, trangThaiP);
				//thuc thi cau lenh sql tra ve doi tuong ResultSet
				ResultSet rs = stmt.executeQuery();
				//Duyet tren ket qua tra ve
				while(rs.next())
				{
					String maPhong = rs.getString(1);
                                        LoaiPhong maLPhong = new LoaiPhong(rs.getString(2));
					String tenPhong = rs.getString(3);
                                        float giaPhong = rs.getFloat(4);
					int soNguoiToiDa = rs.getInt(5);
					String trangThaiPhong = rs.getString(6);
					
					Phong x = new Phong(maPhong,maLPhong, tenPhong,giaPhong , soNguoiToiDa,trangThaiPhong);
					
					//them nv x vao dsnv
					dsp.add(x);
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
			return dsp;
		}
       
        
}
