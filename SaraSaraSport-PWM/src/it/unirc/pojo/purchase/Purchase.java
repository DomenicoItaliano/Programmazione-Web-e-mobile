package it.unirc.pojo.purchase;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;


import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.item.Item;

public class Purchase {
	
	private PurchaseId purchaseId;
	private Customer customer;
	private double amount;
	private Date purchaseDate;
	private Set<Item> items;
	
	public PurchaseId getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(PurchaseId purchaseId) {
		this.purchaseId = purchaseId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Set<Item> getItem() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
	public Purchase() {
		// TODO Auto-generated constructor stub
	}
	
	public Purchase(PurchaseId purchaseId, Customer customer, double amount, Date purchaseDate, Set<Item> items) {
		super();
		this.purchaseId = purchaseId;
		this.customer = customer;
		this.amount = amount;
		this.purchaseDate = purchaseDate;
		this.items = items;
	}
	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", customer=" + customer + ", amount=" + amount
				+ ", purchaseDate=" + purchaseDate + ", items=" + items + "]";
	}
	
	
	
	
	
}
