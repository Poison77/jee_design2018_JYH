package dao.Impl;

import java.sql.*;
import java.util.*;

import dao.DBConn;
import dao.MovieDAO;
import object.Director;
import object.Movie;
import object.Starring;
import object.Tag;

public class MovieDAOImpl implements MovieDAO {

	@Override
	public List<Movie> showMovie_less() throws Exception {
		List<Movie> movie_less = new ArrayList<>();
		String sql = "select * from movie_info";
		try (Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			try (ResultSet rs = pstmt.executeQuery();) 
			{
				while (rs.next()) {
					Movie movie_less1 = new Movie();
					movie_less1.setMoviename(rs.getString("moviename"));
					movie_less1.setMovie_picture(rs.getString("movie_picture"));
					movie_less1.setScore(rs.getLong("score"));
					movie_less.add(movie_less1);
				}
			}
			return movie_less;
		}
	}

	@Override
	public Movie showMovie_more(long movieid) throws Exception {
		Movie movie_more = new Movie();
		String sql1 = "select * from movie_info where movieid=?";
		try (Connection conn = new DBConn().getConn();
				PreparedStatement pstmt1 = conn.prepareStatement(sql1);) {
			pstmt1.setLong(1,movieid);
			try (ResultSet rs1 = pstmt1.executeQuery();) {
					rs1.next();
					movie_more.setMovieid(rs1.getLong("movieid"));
					movie_more.setMoviename(rs1.getString("moviename"));
					movie_more.setMovie_picture(rs1.getString("movie_picture"));
					movie_more.setScore(rs1.getLong("score"));
					movie_more.setYear(rs1.getDate("year"));
					movie_more.setCountry(rs1.getString("country"));
					movie_more.setIntroduction(rs1.getString("introduction"));
					// 导演名字查询
					movie_more.setDirectorid(rs1.getLong("directorid"));
					String sql2 = "select * from director_info where directorid=?";
					PreparedStatement pstmt2 = conn.prepareStatement(sql2);
					ResultSet rs2 = pstmt2.executeQuery();
					while (rs2.next()) {
						Director directors = new Director();
						directors.setDirectorname(rs2.getString("directorname"));
					}
					movie_more.setDirectorname("director.directorname");
					// 演员名字查询
					movie_more.setDirectorid(rs1.getLong("directorid"));
					String sql3 = "select * from staring_info where starringid=?";
					PreparedStatement pstmt3 = conn.prepareStatement(sql3);
					ResultSet rs3 = pstmt3.executeQuery();
					while (rs3.next()) {
						Starring starrings = new Starring();
						starrings.setStarringname(rs3.getString("starringname"));
					}
					movie_more.setStarring("starring.starringname");
					// 分类标签查询
					movie_more.setTagid(rs1.getLong("tagid"));
					String sql4 = "select * from tag_info";
					PreparedStatement pstmt4 = conn.prepareStatement(sql4);
					ResultSet rs4 = pstmt4.executeQuery();
					while (rs4.next()) {
						Tag tag1 = new Tag();
						tag1.setTags(rs4.getString("tags"));
					}
					movie_more.setTags("tags.tags");

			}
		}
		return movie_more;
	}
	
	@Override
	public List<Movie> labelMovie() throws Exception{
		List<Movie> movies = new ArrayList<>();
		String sql = "select * from movie_info where tagid=?";
		try (Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) 
		{
			try (ResultSet rs = pstmt.executeQuery();) 
			{
				while (rs.next()) {
					Movie movie = new Movie();
					movie.setMoviename(rs.getString("moviename"));
					movie.setMovie_picture(rs.getString("movie_picture"));
					movie.setScore(rs.getLong("score"));
					movies.add(movie);
				}
			}
			return movies;
		}
	}
	
	@Override
	public boolean addMovie(Movie movie) throws Exception{
		boolean isSuc=false;
		String sql = "insert into movie(moviename,directorname,movie_picture,starringname,tags,year,country,introduction) values(?,?,?,?,?,?,?,?)";
		try (Connection conn = new DBConn().getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			  pstmt.setString(1,movie.getMoviename());
			  pstmt.setString(2,movie.getDirectorname());
			  pstmt.setString(3,movie.getMovie_picture());
			  pstmt.setString(4,movie.getStarring());
			  pstmt.setString(5,movie.getTags());
			  pstmt.setDate(6,movie.getYear());            //转换日期格式存入数据库 set date year
			  pstmt.setString(7,movie.getCountry());
			  pstmt.setString(8,movie.getIntroduction());
			  int row=pstmt.executeUpdate();
			  isSuc=row>0;
		}
		return isSuc;
	}


}
