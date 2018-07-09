package dao;

import object.Starring;

public interface StarringDAO {

	Starring showStarring(long starringid) throws Exception;		//显示演员详细信息页
	boolean addStarring(Starring starring) throws Exception;		//增加演员
	Starring findStarring(long starringid) throws Exception	;		//通过演员id查询演员
}
