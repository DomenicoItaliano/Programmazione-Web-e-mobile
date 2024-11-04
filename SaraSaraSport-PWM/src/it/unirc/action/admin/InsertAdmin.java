package it.unirc.action.admin;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.admin.Admin;
import it.unirc.pojo.admin.AdminDAO;
import it.unirc.pojo.admin.AdminDAOFactory;

public class InsertAdmin extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Admin admin;

	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	public String execute() {
		AdminDAO a_dao=AdminDAOFactory.getDao();
		a_dao.insertAdmin(admin);
		return SUCCESS;

	}

	public void validate() {
		AdminDAO validate_dao = AdminDAOFactory.getDao();
		if(validate_dao.getAdminByUsername(admin)!=null) {
			this.addFieldError("admin.username", "ERROR: an admin with this username already exists!");
		}

	}


}
