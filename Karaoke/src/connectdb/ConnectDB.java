/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ad
 */
public class ConnectDB {
    public static Connection con = null;
	public static ConnectDB instance = new ConnectDB();
	public static ConnectDB getInstance()
	{
		return instance;
	}
	//ket noi
	public void connect() throws SQLException
	{
            String url = "jdbc:sqlserver://localhost:1433;databasename=QLKara";
            String user = "sa";
            String pass = "123456789";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Ket noi thanh cong");
		
	}
	//dong ket noi
	public void disconnect() throws SQLException
	{
            if(con != null)
            {
		try {
                    con.close();
                    System.out.println("Ket noi bi dong");
		} catch (SQLException e) {
                    System.out.println("Loi khi ket noi" +  e.getMessage());
		}
            }
	}
	//tra ve doi tuong ket noi
	public static Connection getConnection()
	{
            return con;
	}
}
