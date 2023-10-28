/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectdb.ConnectDB;
import entity.DichVu;
import java.sql.Connection;
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
            
		ArrayList<DichVu> dsDV = new ArrayList<DichVu>();
		
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
                                String maDV = rs.getString(1);
				String tenDV = rs.getString(2);
				int soLuong = rs.getInt(3);
                                double giaBan = rs.getDouble(4);
				String donViTinh = rs.getString(5);
                                Boolean trangThaiDV = rs.getBoolean(6);
				DichVu x = new DichVu(maDV,tenDV,soLuong,giaBan,donViTinh,trangThaiDV);
				dsDV.add(x);
                                
			}
            
            return dsDV;
	}
}
