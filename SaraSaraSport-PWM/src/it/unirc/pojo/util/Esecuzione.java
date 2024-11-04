package it.unirc.pojo.util;
import it.unirc.pojo.*;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import javax.transaction.Synchronization;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;




public class Esecuzione {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction tx=null;
		try{
			tx=session.beginTransaction();
			tx.commit();
		}

		catch (Exception e) {
			e.printStackTrace();
			if (tx!=null)
				tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		HibernateUtil.close();
	} }