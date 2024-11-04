package it.unirc.action.admin;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;


public class EditCustomerRequest extends ActionSupport {
	
	  private static final long serialVersionUID = 1L;
	  private Customer customer;
	  private int idCustomer;
	  
	  
	  
	  
	  public Customer getCustomer() {
		return customer;
	}




	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




	public int getIdCustomer() {
		return idCustomer;
	}




	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}




	public String execute(){
	  
		Customer c=new Customer();
		CustomerDAO c_dao=CustomerDAOFactory.getDAO();
		c.setIdCustomer(getIdCustomer());
		customer=c_dao.getCustomer(c);

		return SUCCESS;
	
	  }
}
