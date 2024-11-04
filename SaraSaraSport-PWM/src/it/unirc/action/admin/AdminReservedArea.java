package it.unirc.action.admin;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.admin.Admin;

public class AdminReservedArea extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Admin admin;
	private Map<String, Object> session;

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}




	public String execute(){
		admin= (Admin)session.get("user");

		return SUCCESS;
	}



}

