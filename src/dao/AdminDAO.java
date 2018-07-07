package dao;

import object.Admin;

public interface AdminDAO{
	Admin check(String adminname,String password) throws Exception;
	void add(Admin admin) throws Exception;
		   /*List<String[]> getAllStus() throws Exception;
		   List<Stu> getAllStusByObj() throws Exception;
		    Stu findById(long id) throws Exception;
		   boolean save(Stu stu) throws Exception;
		   boolean delById(long id) throws Exception;
		   boolean update(Stu stu) throws Exception;*/
}
