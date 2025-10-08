package com.tka.service;

import com.tka.dao.BankAccountDao;
import com.tka.entity.BankAccount;

public class BankAccountService {
	
	BankAccountDao dao = new BankAccountDao();
	
	public String createAccount(BankAccount account) {
		String msg = dao.createAccount(account);
		return msg;
	}

}
