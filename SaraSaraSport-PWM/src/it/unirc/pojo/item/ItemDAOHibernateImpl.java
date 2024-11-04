package it.unirc.pojo.item;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import it.unirc.pojo.util.HibernateUtil;


public class ItemDAOHibernateImpl implements ItemDAO {

	public Item getItem(Item p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try{
			t=session.beginTransaction();
			p=(Item) session.get(Item.class, p.getIdItem());
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


	public boolean insertItem(Item p) {
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


	public boolean editItem(Item p) {
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

	public boolean deleteItem(Item p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		boolean result=true;
		try{
			t=session.beginTransaction();
			Query q=session.createQuery("Delete from Item where idItem= :id").setParameter("id", p.getIdItem());
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

	public List<Item> getItems() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		List<Item>items=new ArrayList<Item>();
		try {
			Query q = session.createQuery("from Item");
			items=q.list();

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}

		return items;
	}
	public ArrayList<Item> getItemsJSON() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		ArrayList<Item>items=new ArrayList<Item>();
		try {
			Query q = session.createQuery("from Item");
			items=(ArrayList<Item>)q.list();

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}

		return items;
	}
	public List<Item> getAvailableItems() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		List<Item>res=new ArrayList<Item>();
		try {
			Query q = session.createQuery("from Item where num!=0");
			res=q.list();
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();


		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}

		return res;
	}


	public List<Item> getItembyDescription(String description, String category) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		List<Item>res=new ArrayList<Item>();

		try {
			Query q = session.createQuery("from Item where description= :description and category= :category").setParameter("description", description).setParameter("category", category);
			res=q.list();
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();


		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}

		return res;
	}



	public List<Item> getItembyName(String name, String category) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		List<Item>res=new ArrayList<Item>();
		try {
			Query q = session.createQuery("from Item where name= :nome and category= :category").setParameter("name", name).setParameter("category", category);
			res=q.list();
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();


		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}

		return res;
	}

	public List<Item> getItembyCategory(String category) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		List<Item>res=new ArrayList<Item>();
		try {
			Query q = session.createQuery("from Item where category= :category").setParameter("category", category);
			res=q.list();
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();


		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}

		return res;
	}

	public int maxStockQuantity() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		List<Integer>res;
		try {
			res=session.createSQLQuery("Select MAX(idItem) from Item").list();

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




}
