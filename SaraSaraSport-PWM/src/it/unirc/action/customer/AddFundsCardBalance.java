package it.unirc.action.customer;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;

public class AddFundsCardBalance extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int idCustomer;
	private boolean error=false; //serve solo a segnalare l'errore
	public boolean getError() {
		return error;
	}



	public void setError(boolean error) {
		this.error = error;
	}



	private Customer customer;


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


		if(error) {
			this.addFieldError("money","the quantity entered exceeds the maximum allowed");}
		customer= new Customer();
		customer.setIdCustomer(idCustomer);


		CustomerDAO pd = CustomerDAOFactory.getDAO();
		customer=pd.getCustomer(customer);


		return SUCCESS;
	}


}
