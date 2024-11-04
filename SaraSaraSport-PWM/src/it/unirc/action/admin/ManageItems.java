package it.unirc.action.admin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.item.Item;
import it.unirc.pojo.item.ItemDAO;
import it.unirc.pojo.item.ItemDAOFactory;

public class ManageItems extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private List<Item> items;



	public List<Item> getItems() {
		return items;
	}



	public void setItem(List<Item> items) {
		this.items = items;
	}



	public String execute() {
		ItemDAO p_dao=ItemDAOFactory.getDAO();
		items=p_dao.getItems();
		return SUCCESS;


	}

}
