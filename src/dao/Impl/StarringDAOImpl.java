package dao.Impl;

import java.sql.*;
import dao.DBConn;
import dao.StarringDAO;
import object.Starring;


public class StarringDAOImpl implements StarringDAO {
	
	@Override
	public Starring showStarring(long starringid) throws Exception{
		Starring starring = new Starring();
		String sql = "select * from starring_info where starringid=?";
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			pstmt.setLong(1,starringid);
			try (ResultSet rs = pstmt.executeQuery();) {
				rs.next();
				starring.setStarringname(rs.getString("starringname"));
				starring.setSex(rs.getString("sex"));
			}
		}
		return starring;
	}
	
	@Override
	public boolean addStarring(Starring starring) throws Exception{
		boolean isSuc=false;
		String sql = "insert into starring_info(starringname,sex) values(?,?)";
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			pstmt.setString(1,starring.getStarringname());
		    pstmt.setString(2,starring.getSex());
		    int row=pstmt.executeUpdate();
		    isSuc=row>0;
		}
		return isSuc;
	}
	
	@Override
	public Starring findStarring(long starringid) throws Exception{
		Starring starring = new Starring();
		String sql = "select * from starring_info where starringid=?";
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setLong(1,starringid);
			try (ResultSet rs = pstmt.executeQuery();) {
		        rs.next();
		        starring.setStarringname(rs.getString("starringname"));
		        starring.setSex(rs.getString("sex"));
			}
		}
		return starring;
	}
}
