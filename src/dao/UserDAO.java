package dao;

import object.User;

public interface UserDAO{
	boolean checkUser(String username,String passwords) throws Exception;
	boolean save(User user) throws Exception;
}
