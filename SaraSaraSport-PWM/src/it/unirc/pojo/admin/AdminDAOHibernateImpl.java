package it.unirc.pojo.admin;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import it.unirc.pojo.util.HibernateUtil;



public class AdminDAOHibernateImpl implements AdminDAO {


	public Admin getAdmin(Admin a) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try {
			t=session.beginTransaction();
			a= (Admin) session.get(Admin.class,a.getIdAdmin());
			t.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			t.rollback();
			return null;

		} finally {
			if (session!=null) //spesso omesso
			session.close();
		}
		return a;
	}

	public boolean insertAdmin(Admin a) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		boolean result=true;
		try{
			t=session.beginTransaction();
			session.save(a);
			t.commit();	
		}
		catch(HibernateException e){
			e.printStackTrace();
			t.rollback();
			result=false;
		}finally {
			if (session!=null) 
				session.close();
		}
		return result;
	}

	public boolean editAdmin(Admin a) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try{
			t=session.beginTransaction();
			session.update(a);
			t.commit();
		}
		catch(HibernateException e){
			e.printStackTrace();
			t.rollback();
			return false;
		}finally {
			if (session!=null) 
				session.close();
		}
		return true;
	}


	public boolean deleteAdmin(Admin a) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		boolean result=true;
		try{
			Query q=session.createQuery("Delete from Admin where idAdmin=: id").setParameter("id", a.getIdAdmin());
			q.executeUpdate();
			t.commit();
		}
		catch(HibernateException e){
			e.printStackTrace();
			t.rollback();
			result=false;
		}finally {
			if (session!=null) 
				session.close();
		}
		return result;

	}


	public Admin getAdminByUsername(Admin a) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		List<Admin> admin=null;

		try {
			admin=(List<Admin>) session.createSQLQuery("Select * from Admin where username = :user").addEntity(Admin.class).setParameter("user", a.getUsername()).list();
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		if(admin.size()==0)return null;
		return admin.get(0);
	}


	public List<Admin> getAdmins() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		List<Admin> admin=null;

		try {
			Query q= session.createQuery("from Admin");
			admin=q.list();
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return admin;
	}





}


