package dao;

import object.Admin;

public interface AdminDAO{
	boolean checkAdmin(String adminname,String password) throws Exception;   //����Ա��½��֤
	boolean addAdmin(Admin admin) throws Exception;                                       //��ӹ���Ա
}
