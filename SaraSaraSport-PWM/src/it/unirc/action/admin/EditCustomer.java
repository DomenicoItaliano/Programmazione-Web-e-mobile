package it.unirc.action.admin;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.CustomerDAOFactory;

public class EditCustomer extends ActionSupport{ 
	
private static final long serialVersionUID = 1L;

private Customer customer;






public Customer getCustomer() {
	return customer;
}




public void setCustomer(Customer customer) {
	this.customer = customer;
}







public String execute() {
	CustomerDAO c_dao=CustomerDAOFactory.getDAO();
	c_dao.editCustomer(customer);
	return SUCCESS;

}

}

