/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectdb;

import com.sun.javafx.css.SizeUnits;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ad
 */
public class ConnectDB {
	//dong ket noi
	public void disconnect(Connection con) throws SQLException
	{
            if(con != null)
            {
		try {
                    con.close();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	}
	//tra ve doi tuong ket noi
	public static Connection getConnection() throws SQLException
	{
            Connection con = null;
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QlKara;encrypt=false";
            String user = "sa";
            String pass = "123456789";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Ket noi thanh cong");
            return con;
	}
        public static void main(String[] args) throws SQLException {
            System.out.println(getConnection());
        }
}
