package it.unirc.action.admin;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.admin.Admin;
import it.unirc.pojo.admin.AdminDAO;
import it.unirc.pojo.admin.AdminDAOFactory;

public class EditAdmin extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;

	private Admin admin;
	private Map<String,Object> session; 
	private String new_password;
	private String old_password;



	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getNew_password() {
		return new_password;
	}
	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}
	public String getOld_password() {
		return old_password;
	}
	public void setOld_password(String old_password) {
		this.old_password = old_password;
	}
	public Map<String, Object> getSession() {
		return session;
	}


	public String execute(){
		Admin res=(Admin) session.get("user");
		AdminDAO a_dao=AdminDAOFactory.getDao();
		admin.setIdAdmin(res.getIdAdmin());
		if(res.getPassword().equals(old_password)){
			if(a_dao.editAdmin(admin)) {
				session.put("user",admin);
				return SUCCESS;
			}else {
				return INPUT;
			}
		}else return INPUT;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}



