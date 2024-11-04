package it.unirc.pojo.customer;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerDAO;

import it.unirc.pojo.util.*;
public class CustomerDAOHibernateImpl implements CustomerDAO{

	protected CustomerDAOHibernateImpl(){
	}

	
public Customer getCustomer(Customer c) {
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction t=null;
		
		try {
			t=session.beginTransaction();
			c= (Customer) session.get(Customer.class,c.getIdCustomer());
		    t.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			t.rollback();
			return null;
			
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return c;
	}

	
	public boolean insertCustomer(Customer c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.save(c);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
			result=false;
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return result;
	}

	public boolean editCustomer(Customer c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		boolean result=true;
		try {
			session.update(c);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			result=false;
		} finally {
			if (session!=null) 
				session.close();
		}
		return result;
	}

	public boolean deleteCustomer(Customer c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		boolean result=true;
		try {
			Query q=session.createQuery("Delete from Customer where idCustomer= :id").setParameter("id", c.getIdCustomer());
			q.executeUpdate();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			result=false;
		} finally {
			if (session!=null) 
				session.close();
		}
		return result;
	}

	public Customer getCustomerByUsername(Customer c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		List<Customer> customer=null;
		
		try {
			customer=(List<Customer>) session.createSQLQuery("Select * from Customer where username = :user").addEntity(Customer.class).setParameter("user", c.getUsername()).list();
			transaction.commit();
			
		} catch (HibernateException e) {
			transaction.rollback();
			return null;
			
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		if(customer.size()==0)return null;
		return customer.get(0);
	}

	public List<Customer> getCustomers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		List<Customer> customers=null;
		try {
			Query q = session.createQuery("from Customer");
			customers=q.list();
			
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		
		return customers;
	}


}
