package dao;

import object.User;

public interface UserDAO{
	boolean checkUser(String email,String passwords) throws Exception;   		//�û���¼��֤
	boolean addUser(User user) throws Exception;                                            //�û�ע��
}
