package dao.Impl;

import java.sql.*;
import dao.DBConn;
import dao.DirectorDAO;
import object.Director;


public class DirectorDAOImpl implements DirectorDAO {
	
	@Override
	public Director showDirector(long directorid) throws Exception{
		Director director = new Director();
		String sql = "select * from director_info where directorid=?";
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			pstmt.setLong(1,directorid);
			try (ResultSet rs = pstmt.executeQuery();) {
				rs.next();
				director.setDirectorname(rs.getString("directorname"));
				director.setDirector_picture(rs.getString("director_picture"));
			}
		}
		return director;
	}
	
	@Override
	public boolean addDirector(Director director) throws Exception{
		boolean isSuc=false;
		String sql = "insert into director_info(directorname£¬director_picture) values(?,?)";
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			pstmt.setString(1,director.getDirectorname());
		    pstmt.setString(2,director.getDirector_picture());
		    int row=pstmt.executeUpdate();
		    isSuc=row>0;
		}
		return isSuc;
	}
	
	@Override
	public Director findDirector(long directorid) throws Exception{
		Director director = new Director();
		String sql = "select * from director_info where directorid=?";
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setLong(1,directorid);
			try (ResultSet rs = pstmt.executeQuery();) {
		        rs.next();
		        director.setDirectorname(rs.getString("directorname"));
		        director.setDirector_picture(rs.getString("director_picture"));
			}
		}
		return director;
	}
}
