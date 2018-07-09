package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAO;
import dao.Impl.UserDAOImpl;
import object.User;

public class UserAction extends ActionSupport {
	User user;
	int type;
	UserDAO userdao = new UserDAOImpl();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String userLogin() throws Exception {
		boolean isTrue;
		isTrue = userdao.checkUser(email, passwords)
	}

}
