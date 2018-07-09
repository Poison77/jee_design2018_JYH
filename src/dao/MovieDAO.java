package dao;

import java.util.List;

import object.Movie;

public interface MovieDAO {
	boolean addMovie(Movie movie) throws Exception;				//��ӵ�Ӱ��Ϣfor Admin
	List<Movie> showMovie_less() throws Exception;					//��ҳ��Ӱ��Ϣչʾ
	Movie showMovie_more(long movieid) throws Exception;	//��ϸ��Ӱ��Ϣչʾ
	List<Movie> labelMovie() throws Exception;							//���ձ�ǩ���������Ӱ
}
