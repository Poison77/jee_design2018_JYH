package dao;

import java.sql.*;

//数据库连接方法
public class DBConn {
	private String url = "jdbc:mysql://localhost:3306/film_review";
	private String user = "root";
	private String password = "";
	private String drive = "com.mysql.jdbc.Driver";

	public Connection getConn() {
		Connection con = null;
		// 加载MySql的驱动类
		try {
			Class.forName(drive);
		} catch (Exception e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");
			e.printStackTrace();
		}
		// 建立连接
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException se) {
			System.out.println("数据库连接失败！");
			se.printStackTrace();
		}
		return con;
	}
	
	/*public static void main(String[] args)
	{
		System.out.println(new DBConn().getConn());		
	}*/
}
