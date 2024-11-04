package it.unirc.action.commons;

import java.util.ArrayList;


import com.opensymphony.xwork2.ActionSupport;


import it.unirc.pojo.item.*;

public class ItemsJSON extends ActionSupport  {

	private static final long serialVersionUID = 1L;
	private ArrayList<Item> items;

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String execute() {

		items=new ArrayList<Item>();

		ItemDAO i_dao = ItemDAOFactory.getDAO();
		items = i_dao.getItemsJSON();

		System.out.println(items.toString());
		return SUCCESS;
	}



}
