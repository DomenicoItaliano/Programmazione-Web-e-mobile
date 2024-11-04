package it.unirc.action.admin;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.item.Item;
import it.unirc.pojo.item.ItemDAO;
import it.unirc.pojo.item.ItemDAOFactory;

public class EditItemRequest extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private Item item;
	private int idItem;

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}



	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String execute() {
		Item p=new Item();
		ItemDAO p_dao=ItemDAOFactory.getDAO();
		p.setIdItem(getIdItem());
		item=p_dao.getItem(p);

		return SUCCESS;
	}

}

