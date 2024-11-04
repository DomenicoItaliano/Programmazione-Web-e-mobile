package it.unirc.action.customer;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.purchase.Purchase;
import it.unirc.pojo.purchase.PurchaseDAO;
import it.unirc.pojo.purchase.PurchaseDAOFactory;
import it.unirc.pojo.purchase.PurchaseId;
import it.unirc.pojo.purchase_item.Purchase_Item;
import it.unirc.pojo.purchase_item.Purchase_ItemDAO;
import it.unirc.pojo.purchase_item.Purchase_ItemDAOFactory;
import it.unirc.pojo.purchase_item.Purchase_ItemId;
import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;
import it.unirc.pojo.customer.CustomerDAOFactory;
import it.unirc.pojo.item.Item;
import it.unirc.pojo.item.ItemDAO;
import it.unirc.pojo.item.ItemDAOFactory;

import util.PaymentManagement;
import util.InvoiceManagement;




public class OnlinePurchase extends ActionSupport implements SessionAware,ServletResponseAware, ServletRequestAware{


	private static final long serialVersionUID = 1L;

// 
	private Map<String,Object> session; 

	List<Item> items;
	Customer customer;
	private double total;
	private HttpServletResponse servletResponse;

	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}

	private HttpServletRequest servletRequest;
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}



	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public List<Item> getItems() {
		return items;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String execute() {
		
		
		Purchase p = new Purchase();
		PurchaseDAO pd= PurchaseDAOFactory.getDAO();
		PurchaseId pid= new PurchaseId();
		Calendar cal = Calendar.getInstance();
		pid.setYear(cal.get(Calendar.YEAR));
		int purchaseNumber=pd.maxQuantity();

		pid.setNumber(purchaseNumber+1);

		InvoiceManagement.createInvoice(ServletActionContext.getServletContext().getRealPath("/"),customer, total, items, purchaseNumber+1);
		ItemDAO id=ItemDAOFactory.getDAO();
		Purchase_ItemId piid =new Purchase_ItemId();
		Purchase_Item pi=new Purchase_Item();
		Purchase_ItemDAO pidao= Purchase_ItemDAOFactory.getDAO();
		piid.setYear(cal.get(Calendar.YEAR));
		piid.setNumber(purchaseNumber+1);
		p.setPurchaseId(pid);
		p.setAmount(total);
		Date d= new Date(Calendar.getInstance().getTime().getTime());
		p.setPurchaseDate(d);
        p.setCustomer(customer);
        

		for(Item i: items) {
	
			Item i1=id.getItem(i);
			pi.setQuantity(i.getStockQuantity());
			i.setStockQuantity(i1.getStockQuantity()-i.getStockQuantity());
			piid.setIdItem(i1.getIdItem());
			pi.setId(piid);
			pi.setPurchase(p);
			pi.setItem(i);
			pidao.insertPurchase_Item(pi);   
		}
		
		
	
		PaymentManagement.incrementCardBalance(total, ServletActionContext.getServletContext().getRealPath("/"));
        customer.getCardBalance().setBalance(customer.getCardBalance().getBalance()-total);
        session.put("user", customer);
        CustomerDAO cd =CustomerDAOFactory.getDAO();
        double tot=0;
        for( Purchase purchase: customer.getPurchases()) {
        	tot+=purchase.getAmount();
        }
        tot+=total;
        cd.editCustomer(customer);

         
        
        
        
    	Cookie[] cookies= servletRequest.getCookies();
		for(int i=0;i<cookies.length;i++){
			if(cookies[i].getName().startsWith("cookiePurchase")){
				
				cookies[i].setMaxAge(0);
				cookies[i].setDomain("localhost");
				cookies[i].setPath("/SaraSarasport-PWM");
				servletResponse.addCookie(cookies[i]);
			}
		}
        
        
        
			return SUCCESS;
		}








		public HttpServletResponse getServletResponse() {
		return servletResponse;
	}



	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}



		public void validate() {
			customer=(Customer)session.get("user");
			if(total==0) this.addActionError("You must select a product in order to proceed");
			if(customer.getCardBalance()==null) this.addActionError("You don't have an Associate account");
			if(customer.getCardBalance().getBalance()<total) this.addActionError("You don't have enough money");
           
		}

	}
