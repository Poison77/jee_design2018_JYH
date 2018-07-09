package dao;

import java.util.List;

import object.Movie;

public interface MovieDAO {
	boolean addMovie(Movie movie) throws Exception;				//添加电影信息for Admin
	List<Movie> showMovie_less() throws Exception;					//首页电影信息展示
	Movie showMovie_more(long movieid) throws Exception;	//详细电影信息展示
	List<Movie> labelMovie() throws Exception;							//按照标签分类浏览电影
}
