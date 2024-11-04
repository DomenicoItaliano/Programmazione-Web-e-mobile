package it.unirc.action.commons;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.item.*;

public class Items extends ActionSupport{

	private static final long serialVersionUID = 1L;
	String text;
	int type;
	int category;
	String item_type;
	private List<Item> items;
	 
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	 public String execute() {
		
		if(category==1){
			item_type="Uniform";
			if(type==1){
				
				if(text==""){
					ItemDAO dao=ItemDAOFactory.getDAO();
					items=dao.getItembyCategory(item_type);
					if(items.isEmpty()){this.addActionError("Item not found");}
					return SUCCESS;
				}
				else{
					ItemDAO dao= ItemDAOFactory.getDAO();
					items=dao.getItembyDescription(text,item_type);
					if(items.isEmpty()){this.addActionError("Item not found");}
					return SUCCESS;
				}
			}
			if(type==2){
				if(text==""){
					ItemDAO dao=ItemDAOFactory.getDAO();
					items=dao.getItembyCategory(item_type);
					if(items.isEmpty()){this.addActionError("Item not found");}
					return SUCCESS;
				}
				ItemDAO dao= ItemDAOFactory.getDAO();
				items=dao.getItembyName(text,item_type);
				if(items.isEmpty()){this.addActionError("Item not found");}
				return SUCCESS;
			}

			if(type==3){
				if(text==""){
					ItemDAO dao=ItemDAOFactory.getDAO();
					items=dao.getItembyCategory(item_type);
					if(items.isEmpty()){this.addActionError("Item not found");}
					return SUCCESS;
				}

			}

		}

		if(category==2){
			item_type="Bag";
			if(type==1){
				if(text==""){
					ItemDAO dao=ItemDAOFactory.getDAO();
					items=dao.getItembyCategory(item_type);
					if(items.isEmpty()){this.addActionError("Item not found");}
					return SUCCESS;
				}
				ItemDAO dao= ItemDAOFactory.getDAO();
				items=dao.getItembyDescription(text,item_type);
				if(items.isEmpty()){this.addActionError("Item not found");}
				return SUCCESS;
			}
			if(type==2){
				if(text==""){
					ItemDAO dao=ItemDAOFactory.getDAO();
					items=dao.getItembyCategory(item_type);
					if(items.isEmpty()){this.addActionError("Item not found");}
					return SUCCESS;
				}
				ItemDAO dao= ItemDAOFactory.getDAO();
				items=dao.getItembyName(text,item_type);
				if(items.isEmpty()){this.addActionError("Item not found");}
				return SUCCESS;
			}

			if(type==3){
				if(text==""){
					ItemDAO dao=ItemDAOFactory.getDAO();
					items=dao.getItembyCategory(item_type);
					if(items.isEmpty()){this.addActionError("Item not found");}
					return SUCCESS;
				}
				;
			}
		}

		if(category==3){
			item_type="Boots";
			if(type==1){
				if(text==""){
					ItemDAO dao=ItemDAOFactory.getDAO();
					items=dao.getItembyCategory(item_type);
					if(items.isEmpty()){this.addActionError("Item not found");}
					return SUCCESS;
				}
				ItemDAO dao= ItemDAOFactory.getDAO();
				items=dao.getItembyDescription(text,item_type);
				if(items.isEmpty()){this.addActionError("Item not found");}
				return SUCCESS;
			}
			if(type==2){
				if(text==""){
					ItemDAO dao=ItemDAOFactory.getDAO();
					items=dao.getItembyCategory(item_type);
					if(items.isEmpty()){this.addActionError("Item not found");}
					return SUCCESS;
				}
				ItemDAO dao= ItemDAOFactory.getDAO();
				items=dao.getItembyName(text,item_type);
				if(items.isEmpty()){this.addActionError("Item not found");}
				return SUCCESS;
			}

			if(type==3){
				if(text==""){
					ItemDAO dao=ItemDAOFactory.getDAO();
					items=dao.getItembyCategory(item_type);
					if(items.isEmpty()){this.addActionError("Item not found");}
					return SUCCESS;
				}
				
			}
		}

		
		 item_type="Uniform";

		text="";
		ItemDAO dao= ItemDAOFactory.getDAO();
		items=dao.getItems();
		return INPUT;
		 
		

	}
	

}
