package it.unirc.pojo.purchase;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pojo.purchase.Purchase;
import it.unirc.pojo.purchase.PurchaseDAO;
import it.unirc.pojo.util.*;


	public class PurchaseDAOHibernateImpl implements PurchaseDAO {

		
		public Purchase getPurchase(Purchase p) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t=null;
			try{
				t=session.beginTransaction();
				p=(Purchase) session.get(Purchase.class, p.getPurchaseId());
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
			return p;
		}


		public boolean insertPurchase(Purchase p) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t=null;
			boolean result=true;
			try{
				t=session.beginTransaction();
				session.save(p);
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


		public boolean editPurchase(Purchase p) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t=null;
			boolean result=true;
			try{
				t=session.beginTransaction();
				session.update(p);
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
		
		public int maxQuantity() {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			List<Integer>res;
			try {
				res=session.createSQLQuery("Select MAX(quantity) from Purchase").list();
			
				transaction.commit();
				
			} catch (HibernateException e) {
				transaction.rollback();
				return 0;
				
			} finally {
				if (session!=null) //spesso omesso
					session.close();
			}
			if(res.get(0)==null) {return 0;}
			return res.get(0);
		}
		


		public ArrayList<Purchase> getUserPurchasesJSON(int idCustomer) {
			Session session=HibernateUtil.getSessionFactory().openSession();
			ArrayList<Purchase> res = new ArrayList<Purchase>();
			Transaction transaction=null;
			
			try {
				transaction = session.beginTransaction();
				SQLQuery q = session.createSQLQuery("Select * from Purchase inner join Customer on Purchase.idCustomer=Customer.idCustomer where Customer.idCustomer="+idCustomer);
				q.addEntity(Purchase.class);
				res=(ArrayList<Purchase>) q.list();
				transaction.commit();
			}
			catch(HibernateException e) {
				transaction.rollback();
				e.printStackTrace();
			}
			finally {
				if(session!=null)
					session.close();
			}
			return res;
		}


		

	}



