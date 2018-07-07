package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
	private  String url = "jdbc:mysql://localhost:3306/file_review";
	private  String user = "root";
	private  String password = "";
	private  String drive="com.mysql.jdbc.Driver";
	
	public  Connection getConn() {
		Connection con = null;
		//  加载MySql的驱动类
		try {
			Class.forName(jdbcName);
		} catch (Exception e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
		}
		//  建立连接
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException se) {
			System.out.println("数据库连接失败！");
			se.printStackTrace();
		}
		return con;
	}

	public void dbClose(Connection con, PreparedStatement st, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (st != null) {
				((Connection) st).close();
				st = null;

			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
