package it.unirc.action.customer;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;

public class Reload extends ActionSupport  implements SessionAware {
	private static final long serialVersionUID = 1L;
	private double money;
	private Customer customer;
	private Map<String,Object> session;


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}



	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String execute(){
		customer.getCardBalance().setBalance(customer.getCardBalance().getBalance()+money);
		session.put("user", customer);
		CustomerDAO dao =CustomerDAOFactory.getDAO();
		dao.editCustomer(customer);

		return SUCCESS;
	}

	public void validate(){
		customer=(Customer)session.get("user");
		if(money>1000)this.addFieldError("money","the quantity entered exceeds the maximum allowed");

	}
}
