package it.unirc.action.commons;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteFromCart extends ActionSupport implements ServletResponseAware, ServletRequestAware{

	private static final long serialVersionUID = 1L;

	private int idItem;
	public int getIdItem() {
		return idItem;
	}



	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	private HttpServletResponse servletResponse;

	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}

	private HttpServletRequest servletRequest;
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}


	public String execute() {
		Cookie[] cookies= servletRequest.getCookies();
		for(int i=0;i<cookies.length;i++){

			if(cookies[i].getName().startsWith("cookieItem_"+idItem)){
				cookies[i].setMaxAge(0);
				servletResponse.addCookie(cookies[i]);
			}}



		return SUCCESS;
	}



}

