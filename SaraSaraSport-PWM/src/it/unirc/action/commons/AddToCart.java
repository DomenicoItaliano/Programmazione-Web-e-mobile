package it.unirc.action.commons;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.item.Item;


public class AddToCart extends ActionSupport implements ServletResponseAware,ServletRequestAware{
	private static final long serialVersionUID = 1L;
	private HttpServletRequest servletRequest;
	private Item item;
	private int idItem; 
	private int quantity;
	private HttpServletResponse servletResponse;


	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	public String execute() {

		Cookie[]cookies=servletRequest.getCookies();
		for(int i=0;i<cookies.length;i++) {
			if(cookies[i].getName().startsWith("cookieItem")) {
				String id_quant=cookies[i].getValue();
				int sep=id_quant.indexOf("_");
				String ids=id_quant.substring(0,sep);
				String quants=id_quant.substring(sep+1);
				int id=Integer.parseInt(ids);
				int num=Integer.parseInt(quants);
				if(id==idItem){
					int val=quantity+num;
					String x=idItem+"_"+val;
					Cookie cookie=new Cookie("cookieItem_"+idItem,x);
					cookie.setMaxAge(60*60*24);//1 day
					servletResponse.addCookie(cookie);

				}
			}else{
				String value=idItem+"_"+quantity;
				Cookie cookie=new Cookie("cookieItem_"+idItem,value);
				cookie.setMaxAge(60*60*24);//1 giorno
				servletResponse.addCookie(cookie);
			}

		}


		return SUCCESS;
	}


	public void validate() {
		System.out.println("I'm here");
		if(quantity<=0 || quantity>item.getStockQuantity()) {
			this.addFieldError("quantity", "Enter a valid quantity");
		}
	}

}

