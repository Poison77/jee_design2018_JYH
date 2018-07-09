package dao;

import object.Director;

public interface DirectorDAO {

	Director showDirector(long directorid) throws Exception;		//显示导演详细信息页
	boolean addDirector(Director director) throws Exception;		//增加导演
	Director findDirector(long directorid) throws Exception;		//按照id查询导演
}
