package it.unirc.action.customer;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.Customer;

public class CustomerReservedArea  extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	Customer customer;
	private Map<String, Object> session;

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




	public String execute(){
		customer= (Customer)session.get("user");

		return SUCCESS;
	}



}
