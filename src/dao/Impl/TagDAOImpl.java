package dao.Impl;

import java.sql.*;
import dao.DBConn;
import dao.TagDAO;
import object.Tag;

public class TagDAOImpl implements TagDAO {
	
	public boolean addTag(Tag tag) throws Exception{
		String sql = "insert into tag_info(tags) values(?)";
		boolean isSuc=false;
		try (  Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			pstmt.setString(1,tag.getTags());
		    int row=pstmt.executeUpdate();
		    isSuc=row>0;
		}
		return isSuc;
	}
	
}
