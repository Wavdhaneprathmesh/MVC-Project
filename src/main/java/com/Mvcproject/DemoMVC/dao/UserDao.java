package com.Mvcproject.DemoMVC.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.sql.ordering.antlr.Factory;
import org.springframework.stereotype.Repository;

import com.Mvcproject.DemoMVC.entity.User;

@Repository
public class UserDao {
	
	SessionFactory factory;

	public User checkUser(User user) {
		Session session = null;
		Transaction tx = null;
		User u=null;
		String hqlquery="from User where username=:myusername and password =:mypassword";
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			Query<User> query =session.createQuery(hqlquery,User.class);
			query.setParameter("myusername",user.getUsername() );
			query.setParameter("mypassword",user.getPassword() );
			
			u= query.uniqueResult();
			tx.commit();
			
		} catch (Exception e) {
			
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return null;
		
	}

}
