package dao.Impl;

import java.sql.*;
import dao.DBConn;
import dao.ReviewDAO;
import object.Review;

public class ReviewDAOImpl implements ReviewDAO {
	
	public boolean addReview(Review review) throws Exception{
		boolean isSuc=false;
		String sql = "insert into review_info(movieid,userid,review,mark,time) values(?,?,?,?,?)";
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			/*pstmt.setString(1,);
		    pstmt.setString(2,);*/
		    pstmt.setString(3,review.getReview());
		    pstmt.setString(4,review.getMark());
		    //获取当前时间存入数据库
		    java.util.Date  date=new java.util.Date();
		    java.sql.Date  nowdate=new java.sql.Date(date.getTime());
		    pstmt.setDate(5, nowdate);
		    int row=pstmt.executeUpdate();
		    isSuc=row>0;
		}
		return isSuc;
	}
	
	public boolean delReview(long reviewid) throws Exception{
		boolean isSuc=false;
		String sql = "delete from review_info where reviewid=?";
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setLong(1,reviewid);
			int row=pstmt.executeUpdate();
		      isSuc=row>0;
		}
		return isSuc;
	}
}
