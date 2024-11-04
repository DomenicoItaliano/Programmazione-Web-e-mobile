package it.unirc.action.commons;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private int type;
	private Map<String,Object> session; 





	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String execute(){

		session.clear();
		return "success";
	}



}
