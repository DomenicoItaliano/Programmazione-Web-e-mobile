package it.unirc.pojo.purchase;

import it.unirc.pojo.purchase.PurchaseDAO;
import it.unirc.pojo.purchase.PurchaseDAOHibernateImpl;

public class PurchaseDAOFactory {

	private static PurchaseDAOHibernateImpl dao=null;

	public PurchaseDAOFactory() {
	}

	public static synchronized PurchaseDAO getDAO(){
		if(dao==null){
			dao=new PurchaseDAOHibernateImpl();
		}
		return dao;
	}
}
