package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tka.config.HibernateConfig;
import com.tka.entity.BankAccount;

public class BankAccountDao {

	
		public String createAccount(BankAccount account) {
			String msg = "";
			Session session = HibernateConfig.getSession();
			
			try {
				Transaction tr = session.beginTransaction();
				session.save(account);
				tr.commit();
				msg = "Account Created Successfully";
				}
			catch(Exception e) {
				e.printStackTrace();
				msg = "Something went wrong";
			}
			finally {
				session.close();
			}
			
			return msg;
			
		}
		
	

}
