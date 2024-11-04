package it.unirc.action.admin;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;
import it.unirc.pojo.cardBalance.CardBalance;
import it.unirc.pojo.cardBalance.CardBalanceDAO;
import it.unirc.pojo.cardBalance.CardBalanceDAOFactory;

public class InsertCustomer extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private Customer customer;

	public String execute(){
		int id=customer.getIdCustomer();
		CardBalance c=new CardBalance(id,0,customer);
		CardBalanceDAO dao1=CardBalanceDAOFactory.getDAO();
		if(dao1.insertCardBalance(c)){
			return SUCCESS;
		}
		else{return INPUT;}
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	
	}


	public void validate() {
		CustomerDAO validate_dao = CustomerDAOFactory.getDAO();
		if(validate_dao.getCustomerByUsername(customer)!=null) {
			this.addFieldError("customer.username", "ERROR: an customer with this username already exists!");
		}

	}
}
