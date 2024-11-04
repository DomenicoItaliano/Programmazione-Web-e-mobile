package it.unirc.action.customer;

import com.opensymphony.xwork2.ActionSupport;


import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;
import it.unirc.pojo.cardBalance.CardBalance;



public class Registration extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Customer customer;
	private String confirmation;

	public String execute(){
		int id=customer.getIdCustomer();
		CardBalance c=new CardBalance(id,0,customer);
		CustomerDAO dao=CustomerDAOFactory.getDAO();
		customer.setCardBalance(c);
		dao.insertCustomer(customer);
		return SUCCESS;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void validate(){
		CustomerDAO dao=CustomerDAOFactory.getDAO();
		Customer result=dao.getCustomerByUsername(customer);
		if(result!=null){
			this.addFieldError("customer.username", "username already exist");
		}


	}
}
