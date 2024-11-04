package it.unirc.pojo.item;

import it.unirc.pojo.item.ItemDAO;
import it.unirc.pojo.item.ItemDAOHibernateImpl;

public class ItemDAOFactory {
private static ItemDAO dao=null;
	
	
	public ItemDAOFactory() {
	}


	public static synchronized ItemDAO getDAO(){
		if(dao==null){
			dao=new ItemDAOHibernateImpl();
			return dao;
		}
		return dao;
	}
}
