package it.unirc.action.admin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;

public class CustomersOverview extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private List<Customer> customers;
	

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public String execute() {
		CustomerDAO c_dao=CustomerDAOFactory.getDAO();
		customers=c_dao.getCustomers();
		return SUCCESS;

	}


}
