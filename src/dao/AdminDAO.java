package dao;

import object.Admin;

public interface AdminDAO{
	boolean checkAdmin(String adminname,String password) throws Exception;   //管理员登陆验证
	boolean addAdmin(Admin admin) throws Exception;                                       //添加管理员
}
