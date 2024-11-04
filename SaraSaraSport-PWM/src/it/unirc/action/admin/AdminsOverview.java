package it.unirc.action.admin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.admin.Admin;
import it.unirc.pojo.admin.AdminDAO;
import it.unirc.pojo.admin.AdminDAOFactory;

public class AdminsOverview extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private List<Admin> admins;
	

	public List<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}

	public String execute() {
		AdminDAO a_dao=AdminDAOFactory.getDao();
		admins=a_dao.getAdmins();
		return SUCCESS;

	}


}
