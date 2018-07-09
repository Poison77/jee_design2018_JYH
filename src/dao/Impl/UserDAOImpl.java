package dao.Impl;

import java.sql.*;
import dao.DBConn;
import dao.UserDAO;
import object.User;

//µÇÂ½
public class UserDAOImpl implements UserDAO {
	@Override
	public boolean checkUser(String email, String passwords) throws Exception {
		String sql = "select * from user_info where email =? and where passwords =?";
		boolean isHave = false;
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			pstmt.setString(1, email);
			pstmt.setString(2,passwords);
			try (ResultSet rs = pstmt.executeQuery();) 
				{
					isHave = rs.next();
				}
		}
		return isHave;
	}
	
	@Override
	public boolean addUser(User user) throws Exception{
		boolean isSuc=false;
		String sql = "insert into user_info(firstname,lastname,email,passwords) values(?,?,?,?)";
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			pstmt.setString(1,user.getFirstname());
			pstmt.setString(1,user.getLastname());
			pstmt.setString(1,user.getEmail());
		    pstmt.setString(2,user.getPasswords());
		    int row=pstmt.executeUpdate();
		    isSuc=row>0;
		}
		return isSuc;
	}

	
}
