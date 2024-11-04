package it.unirc.pojo.customer;

import java.util.List;


public interface CustomerDAO {
	public Customer getCustomer(Customer c);
	public boolean insertCustomer(Customer c);
	public boolean editCustomer(Customer c);
	public boolean deleteCustomer(Customer c);
	public Customer getCustomerByUsername(Customer c);
	public List<Customer> getCustomers();
}

