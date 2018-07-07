package login;

import object.Admin;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")			//告诉编译器忽略指定的警告，不用在编译完成后出现警告信息
public class CheckLoginAdmin extends ActionSupport{
	Admin admin;
	
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	@Override public String execute(){
		 if("admin".equals(admin.getAdminname()) && "jia123".equals(admin.getPassword())){
			 return "success";
		}else return "input";
	}

	@Override public void validate(){
		if(this.admin.getAdminname().isEmpty()){
			addFieldError("admin.username","没有输入用户名!");	   //在login.jsp中使用<s:fielderror/> 调用
			}
		if(admin.getPassword().isEmpty()){
			addFieldError("admin.password","密码不能为空!");
		}
	}
}
	
