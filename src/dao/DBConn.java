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
		//  ����MySql��������
		try {
			Class.forName(jdbcName);
		} catch (Exception e) {
			System.out.println("�Ҳ������������� ����������ʧ�ܣ�");
			e.printStackTrace();
		}
		//  ��������
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException se) {
			System.out.println("���ݿ�����ʧ�ܣ�");
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
