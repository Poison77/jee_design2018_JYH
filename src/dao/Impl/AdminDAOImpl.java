package dao.Impl;

import java.sql.*;
import dao.AdminDAO;
import dao.DBConn;
import object.Admin;


public class AdminDAOImpl implements AdminDAO {
	//µÇÂ½
	@Override
	public boolean checkAdmin(String adminname, String password) throws Exception {
		String sql = "select * from admin_info where adminname =? and password =?";
		boolean isHave = false;
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			pstmt.setString(1, adminname);
			pstmt.setString(2,password);
			try (ResultSet rs = pstmt.executeQuery();) 
				{
					isHave = rs.next();
				}
		}
		return isHave;
	}
	
	//Ôö¼Ó
	@Override
	public boolean addAdmin(Admin admin) throws Exception{
		boolean isSuc=false;
		String sql = "insert into admin_info(adminname,password) values(?,?)";
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			pstmt.setString(1,admin.getAdminname());
		    pstmt.setString(2,admin.getPassword());
		    int row=pstmt.executeUpdate();
		    isSuc=row>0;
		}
		return isSuc;
	}
	
}
