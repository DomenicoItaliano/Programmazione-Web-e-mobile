package it.unirc.action.commons;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.admin.Admin;
import it.unirc.pojo.admin.AdminDAO;
import it.unirc.pojo.admin.AdminDAOFactory;
import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;




public class Login extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private String username;
	private String password;
	private int type;
	private Customer customer;
	private Admin admin;


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public void setSession(Map<String, Object> session) {
		this.session=session;

	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	public String execute(){
		
		System.out.println("username= " + username);
		System.out.println(("pw=" + password));

		if(type==2){
			Customer customer=new Customer();
			customer.setUsername(username);
			CustomerDAO dao=CustomerDAOFactory.getDAO();
			Customer c=dao.getCustomerByUsername(customer);
			if(c==null||!c.getPassword().equals(password)){
				this.addFieldError("username","incorrect credentials");
				return INPUT;
			}
			session.put("user",c);
			return "CustomerArea";
		}

		if(type==1){
				System.out.println("eccole qua");
			it.unirc.pojo.admin.Admin admin=new Admin();
			admin.setUsername(username);
			AdminDAO dao=AdminDAOFactory.getDao();
			Admin a=dao.getAdminByUsername(admin);
			if(a==null||!a.getPassword().equals(password)){
				this.addFieldError("username","incorrect credentials");
				return INPUT;
			}
			 System.out.println("qui ci sono le credenziali");
			session.put("user",a);
			return "AdminArea";
			// return SUCCESS;

		}

		return INPUT;
		//return SUCCESS;


	}

}