package it.unirc.pojo.customer;

import it.unirc.pojo.customer.CustomerDAOHibernateImpl;

public class CustomerDAOFactory {
	private static CustomerDAOHibernateImpl dao = null;
	private CustomerDAOFactory(){
	  }
	
	public static synchronized CustomerDAOHibernateImpl getDAO() { //posso avere una sola istanza
	    if ( dao == null ) {
	    	dao = new CustomerDAOHibernateImpl();
	    }
	    return dao;
	  } 


}
