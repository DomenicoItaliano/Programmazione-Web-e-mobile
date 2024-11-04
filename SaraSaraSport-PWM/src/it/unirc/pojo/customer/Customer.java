package it.unirc.pojo.customer;

import java.util.HashSet;
import java.util.Set;

import it.unirc.pojo.cardBalance.CardBalance;
import it.unirc.pojo.purchase.Purchase;

public class Customer {
	
private int idCustomer;
private String name;
private String surname;
private String username;
private String password;
private String email;
private int telephone;
private Set<Purchase> purchases = new HashSet<Purchase>(0);
private CardBalance cardBalance;


public int getIdCustomer() {
	return idCustomer;
}
public void setIdCustomer(int idCustomer) {
	this.idCustomer = idCustomer;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getTelephone() {
	return telephone;
}
public void setTelephone(int telephone) {
	this.telephone = telephone;
}
public Set<Purchase> getPurchases() {
	return purchases;
}
public void setPurchases(Set<Purchase> purchases) {
	this.purchases = purchases;
}
public CardBalance getCardBalance() {
	return cardBalance;
}
public void setCardBalance(CardBalance cardBalance) {
	this.cardBalance = cardBalance;
}
public Customer() {
	// TODO Auto-generated constructor stub
}

public Customer(int idCustomer, String name, String surname, String username, String password, String email,
		int telephone, CardBalance cardBalance) {
	super();
	this.idCustomer = idCustomer;
	this.name = name;
	this.surname = surname;
	this.username = username;
	this.password = password;
	this.email = email;
	this.telephone = telephone;
	this.cardBalance = cardBalance;
}
@Override
public String toString() {
	return "Customer [idCustomer=" + idCustomer + ", name=" + name + ", surname=" + surname + ", username=" + username
			+ ", password=" + password + ", email=" + email + ", telephone=" + telephone + ", cardBalance=" + cardBalance + "]";
}


}
