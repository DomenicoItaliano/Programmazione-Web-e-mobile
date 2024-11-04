package it.unirc.action.commons;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.item.Item;
import it.unirc.pojo.item.ItemDAO;
import it.unirc.pojo.item.ItemDAOFactory;

public class ItemOverview extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private int idItem;
	private boolean error=false; //serve solo a segnalare l'error
    public boolean getError() {
		return error;
	}



	public void setError(boolean error) {
		this.error = error;
	}



	private Item item;


	public Item getItem() {
		return item;
	}



	public void setItem(Item item) {
		this.item = item;
	}



	public int getIdItem() {
		return idItem;
	}



	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}



	public String execute(){
	
		if(error) {
		this.addFieldError("quantity", "Choose a valid quantity");}
		
		item= new Item();
		item.setIdItem(idItem);

		
		ItemDAO pd = ItemDAOFactory.getDAO();
		item=pd.getItem(item);
	
		
		return SUCCESS;
	}

}
