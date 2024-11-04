package it.unirc.action.commons;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.item.Item;
import it.unirc.pojo.item.ItemDAO;
import it.unirc.pojo.item.ItemDAOFactory;



public class Cart extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = 1L;
	private HttpServletRequest servletRequest; 


	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	private List<Item> items;
	double total;
	double finalCost;


	public double getfinalCost() {
		return finalCost;
	}
	public void setFinalCost(double finalCost) {
		this.finalCost = finalCost;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	public String execute() {
		items=new Vector<Item>();
		ItemDAO idao=ItemDAOFactory.getDAO();

		Cookie[]cookies=servletRequest.getCookies();
		for(int i=0;i<cookies.length;i++) {
			if(cookies[i].getName().startsWith("cookieItem")) {
				String id_quant=cookies[i].getValue();


				int sep=id_quant.indexOf("_");
				String ids=id_quant.substring(0,sep);
				String quants=id_quant.substring(sep+1);
				int id=Integer.parseInt(ids);
				int quantity=Integer.parseInt(quants);



				Item it= new Item();
				it.setIdItem(id);
				it=idao.getItem(it);
				it.setStockQuantity(quantity);
				items.add(it);
				total=total+(double)Math.round((it.getPrice()*it.getStockQuantity()*100))/100;
				total=(double)(Math.round(total*100))/100;
			}
		}
		return SUCCESS;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

}








