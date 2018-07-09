package dao;

import java.sql.*;

//���ݿ����ӷ���
public class DBConn {
	private String url = "jdbc:mysql://localhost:3306/film_review";
	private String user = "root";
	private String password = "";
	private String drive = "com.mysql.jdbc.Driver";

	public Connection getConn() {
		Connection con = null;
		// ����MySql��������
		try {
			Class.forName(drive);
		} catch (Exception e) {
			System.out.println("�Ҳ������������� ����������ʧ�ܣ�");
			e.printStackTrace();
		}
		// ��������
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException se) {
			System.out.println("���ݿ�����ʧ�ܣ�");
			se.printStackTrace();
		}
		return con;
	}
	
	/*public static void main(String[] args)
	{
		System.out.println(new DBConn().getConn());		
	}*/
}
