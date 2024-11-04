package it.unirc.pojo.purchase_item;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pojo.purchase_item.Purchase_Item;
import it.unirc.pojo.util.HibernateUtil;

public class Purchase_ItemDAOHibernateImpl implements Purchase_ItemDAO {
	public Purchase_Item getPurchase_Item(Purchase_Item f) {
		  Session session = HibernateUtil.getSessionFactory().openSession();
		  Transaction t=null;
		  try{
		   t=session.beginTransaction();
		   f=(Purchase_Item) session.get(Purchase_Item.class, f.getId());
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
		  return f;
		 }


		 public boolean insertPurchase_Item(Purchase_Item f) {
		  Session session = HibernateUtil.getSessionFactory().openSession();
		  Transaction t=null;
		  boolean result=true;
		  try{
		   t=session.beginTransaction();
		   session.save(f);
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

		 
		 public boolean editPurchase_Item(Purchase_Item f) {
		  Session session = HibernateUtil.getSessionFactory().openSession();
		  Transaction t=null;
		  boolean result=true;
		  try{
		   t=session.beginTransaction();
		   session.update(f);
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
}
