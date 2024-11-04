package it.unirc.pojo.item;
import java.util.HashSet;
import java.util.Set;

import it.unirc.pojo.purchase.Purchase;
import it.unirc.pojo.admin.Admin;


public class Item {
	private int idItem;
	private String name;
	private String img;
	private String description;
	private double price;
	private int stockQuantity;
	private Admin admin;
	private String category;
	private Set <Purchase> purchases = new HashSet<Purchase>();


	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public Set<Purchase> getPurchase() {
		return purchases;
	}
	public void setPurchase(Set<Purchase> purchases) {
		this.purchases = purchases;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int idItem, String name, String img, String description, double price, int stockStockQuantity, Admin admin,
			String category, int stockQuantity) {
		super();
		this.idItem = idItem;
		this.name = name;
		this.img = img;
		this.description = description;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.admin = admin;
		this.category = category;
	}








}
