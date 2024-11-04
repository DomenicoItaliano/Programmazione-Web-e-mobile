package it.unirc.action.customer;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;

public class ViewInvoices extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;

	Customer customer;


	private Map<String,Object> session; 




	public String execute() {

		CustomerDAO cd = CustomerDAOFactory.getDAO();

		customer=cd.getCustomer((Customer)session.get("user"));

		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}

