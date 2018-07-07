package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import DAOImp.AdminDAOImp;
import dao.*;
import object.Admin;

@SuppressWarnings("serial")                                   //告诉编译器忽略指定的警告，不用在编译完成后出现警告信息
public class LoginAction extends ActionSupport {
	Admin admin;
    /*String test_string;

	public String getTest_string() {
		return test_string;
	}
	public void setTest_string(String test_string) {
		this.test_string = test_string;
	}*/

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	@Override public void validate(){
		if(this.admin.getAdminname().isEmpty()){
			addFieldError("stu.username","用户名不能为空");
		}
		if(admin.getPassword().isEmpty()){
			addFieldError("stu.pass","密码不能为空");
		}
	}
	
	public String checkInDb()throws Exception{
		 AdminDAO dao=new AdminDAOImp();
		 boolean isHave=dao.checkAdmin(admin.getAdminname(), null) != null;
		 if(isHave){
		   Map session=ActionContext.getContext().getSession();
		   session.put("admin", admin);
		   return "suc";
		 }else
			 return "fail";
	}
}
