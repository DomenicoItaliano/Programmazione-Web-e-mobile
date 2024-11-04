package it.unirc.pojo.admin;

import it.unirc.pojo.admin.AdminDAO;
import it.unirc.pojo.admin.AdminDAOHibernateImpl;

public class AdminDAOFactory {

	private static AdminDAO dao=null;

	public AdminDAOFactory() {
	}
	public static AdminDAO getDao(){
		if(dao==null){

			dao=new AdminDAOHibernateImpl();

		}
		return dao;
	}
}
