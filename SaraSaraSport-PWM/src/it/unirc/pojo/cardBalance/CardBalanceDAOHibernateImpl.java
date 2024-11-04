package it.unirc.pojo.cardBalance;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pojo.util.HibernateUtil;




public class CardBalanceDAOHibernateImpl implements CardBalanceDAO {
	public CardBalance getCardBalance(CardBalance c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try{
			t=session.beginTransaction();
			c=(CardBalance) session.get(CardBalance.class, c.getIdCustomer());
			t.commit();
			
		}
		catch(HibernateException e){
			e.printStackTrace();
			t.rollback();
			return null;
		}
		finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return c;
	}


	public boolean insertCardBalance(CardBalance c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		boolean result=true;
		try{
			t=session.beginTransaction();
			session.save(c);
			t.commit();
		}
		catch(HibernateException e){
			e.printStackTrace();
			t.rollback();
			result=false;

		}
		finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return result;
	}

	
	public boolean editCardBalance(CardBalance c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		boolean result=true;
		try{
			t=session.beginTransaction();
			session.update(c);
			t.commit();
		}
		catch(HibernateException e){
			e.printStackTrace();
			t.rollback();
			result=false;

		}
		finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return result;
	}

	
	public boolean deleteCardBalance(CardBalance c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		boolean result=true;
		try{
			t=session.beginTransaction();
			Query q=session.createQuery("Delete from CardBalance where idCliente= :id").setParameter("id", c.getIdCustomer());
			q.executeUpdate();
			t.commit();
		}
		catch(HibernateException e){
			e.printStackTrace();
			t.rollback();
			result=false;
		}
		return result;
	}

}

