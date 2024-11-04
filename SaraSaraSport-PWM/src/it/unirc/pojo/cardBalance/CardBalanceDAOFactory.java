package it.unirc.pojo.cardBalance;

import it.unirc.pojo.cardBalance.CardBalanceDAO;
import it.unirc.pojo.cardBalance.CardBalanceDAOHibernateImpl;

public class CardBalanceDAOFactory {
	private static CardBalanceDAO dao=null;

	public CardBalanceDAOFactory() {
	}

	public static synchronized CardBalanceDAO getDAO(){
		if(dao==null){
			dao=new CardBalanceDAOHibernateImpl();
		}
		return dao;
	}

}
