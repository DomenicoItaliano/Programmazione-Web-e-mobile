package it.unirc.pojo.purchase_item;

import it.unirc.pojo.item.Item;
import it.unirc.pojo.purchase.Purchase;

public class Purchase_Item {
	private Purchase_ItemId id;
	private int quantity;
	private Purchase  purchase;
	private Item item;
	
	public Purchase_ItemId getId() {
		return id;
	}
	public void setId(Purchase_ItemId id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Purchase getPurchase() {
		return purchase;
	}
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	@Override
	public String toString() {
		return "Purchase_Item [quantity=" + quantity + ", purchase=" + purchase + ", item=" + item + "]";
	}
	public Purchase_Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Purchase_Item(Purchase_ItemId id, int quantity, Purchase purchase, Item item) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.purchase = purchase;
		this.item = item;
	}
	
	
	
	
}
