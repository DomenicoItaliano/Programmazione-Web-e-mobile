package it.unirc.pojo.cardBalance;

import it.unirc.pojo.customer.Customer;

public class CardBalance {
	private int idCustomer;
	private double balance;
	private  Customer customer;
	
	
	public CardBalance(int idCustomer, double balance, Customer customer) {
		super();
		this.idCustomer = idCustomer;
		this.balance = balance;
		this.customer = customer;
	}
	public CardBalance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	
}
