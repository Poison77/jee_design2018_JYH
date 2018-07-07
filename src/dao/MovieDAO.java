package dao;

import object.Movie;

public interface MovieDAO {
	boolean movie_add(Movie movie) throws Exception;
	boolean label_add(Movie movie) throws Exception;

}
