package it.unirc.action.admin;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.admin.Admin;
import it.unirc.pojo.item.Item;
import it.unirc.pojo.item.ItemDAO;
import it.unirc.pojo.item.ItemDAOFactory;

public class EditItem extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;

	private Item item;
private Map<String, Object> session;
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public Item getItem() {
		return item;
	}



	public void setItem(Item item) {
		this.item = item;
	}



	public String execute() {
		Admin a=(Admin) session.get("user");
		item.setAdmin(a);
		ItemDAO i_dao=ItemDAOFactory.getDAO();
		i_dao.editItem(item);
		return SUCCESS;

	}

}

