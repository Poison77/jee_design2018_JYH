package dao.DAOImpl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import utils.JdbcUtils;
import java.sql.*;
import dao.AdminDAO;
import object.Admin;



public class AdminDAOImpl implements AdminDAO {

	public void add(Admin admin){
		try{
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "insert into admin(adminid,adminname,password) values(?,?,?)";
			Object params[] = {admin.getAdminid(), admin.getAdminname(), admin.getPassword()};
			runner.update(sql, params);
		} catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public Admin find(String adminname, String password){
		try{
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "select * from user where adminname=? and password=?";
			Object params[] = {adminname, password};
			return (Admin)runner.query(sql, params, new BeanHandler(Admin.class));
		} catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
