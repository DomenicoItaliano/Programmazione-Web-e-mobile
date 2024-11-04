package it.unirc.action.admin;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;
import it.unirc.pojo.cardBalance.CardBalance;
import it.unirc.pojo.cardBalance.CardBalanceDAO;
import it.unirc.pojo.cardBalance.CardBalanceDAOFactory;

public class DeleteCustomer extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int idCustomer;


	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String execute() throws Exception {
		Customer c=new Customer();
		CardBalanceDAO c1=CardBalanceDAOFactory.getDAO();
		CustomerDAO c_dao=CustomerDAOFactory.getDAO();
		c.setIdCustomer(getIdCustomer());
		c=c_dao.getCustomer(c);
		CardBalance c2=new CardBalance();
		c2.setIdCustomer(c.getIdCustomer());
		c1.deleteCardBalance(c2);
		c_dao.deleteCustomer(c);

		return SUCCESS;

	}
}

