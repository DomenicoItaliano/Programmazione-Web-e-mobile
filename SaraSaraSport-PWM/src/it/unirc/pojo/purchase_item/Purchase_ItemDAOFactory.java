package it.unirc.pojo.purchase_item;

import it.unirc.pojo.purchase_item.Purchase_ItemDAO;
import it.unirc.pojo.purchase_item.Purchase_ItemDAOHibernateImpl;

public class Purchase_ItemDAOFactory {
	private static Purchase_ItemDAO dao=null;
	 
	 
	 public Purchase_ItemDAOFactory() {
	 }


	 public static synchronized Purchase_ItemDAO getDAO(){
	  if(dao==null){
	   dao=new Purchase_ItemDAOHibernateImpl();
	   
	  }
	  return dao;
	 
	}

}
