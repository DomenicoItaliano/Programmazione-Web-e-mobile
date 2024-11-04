package it.unirc.action.customer;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;

public class EditCustomer extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;

	Customer customer;
	private String password;
	private String old_password;
	private Map<String,Object> session;


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOld_password() {
		return old_password;
	}
	public void setOld_password(String old_password) {
		this.old_password = old_password;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Map<String, Object> getSession() {
		return session;
	}


	public String execute(){
		Customer c=(Customer) session.get("user");
		CustomerDAO c_dao=CustomerDAOFactory.getDAO();
		customer.setIdCustomer(c.getIdCustomer());
		customer.setCardBalance(c.getCardBalance());
		if(c.getPassword().equals(old_password)){
			if(c_dao.editCustomer(customer)) {
				session.put("user",customer);
				return SUCCESS;
			}else {
				return INPUT;
			}
		}else return INPUT;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}