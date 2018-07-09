package dao;

import object.User;

public interface UserDAO{
	boolean checkUser(String email,String passwords) throws Exception;   		//用户登录验证
	boolean addUser(User user) throws Exception;                                            //用户注册
}
