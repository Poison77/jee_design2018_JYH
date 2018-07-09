package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.*;
import object.Admin;

/*		告诉编译器忽略指定的警告，不用在编译完成后出现警告信息；
		任何可以序列化的类（即实现Serializable）都应声明UID*/
@SuppressWarnings("serial")                                   
public class LoginAction extends ActionSupport {
	Admin admin;
	//测使用字符串属性test_string
    /*String test_string;

	public String getTest_string() {
		return test_string;
	}
	public void setTest_string(String test_string) {
		this.test_string = test_string;
	}*/

	public String checkAdmin() throws Exception {
		System.out.println("admin"+admin.getAdminname());
		AdminDAO dao = new dao.Impl.AdminDAOImpl();
		boolean isHave = dao.checkAdmin(admin.getAdminname(), admin.getPassword());
		if(isHave){
			//这个方法获得的不是HttpSession对象，而是一个Map对象。
			   Map<String, Object> session=ActionContext.getContext().getSession();
			   session.put("admin", admin);
			   return "suc";
			 }else
				 return "fail";
	}
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
}