package com.capgemini.PaymentApplication.service;

import java.util.List;

import com.capgemini.PaymentApplication.bean.WalletApplicationData;
import com.capgemini.PaymentApplication.dao.WalletApplicationDao;

public class WalletApplicationService implements  IWalletApplicationService{
	WalletApplicationDao dao = new WalletApplicationDao();
	
	
	public int createAccount(WalletApplicationData bean) {
		
		return dao.createAccount(bean);
	}

	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return dao.login(username, password);
	}

	public double showBalance() {
		// TODO Auto-generated method stub
		return dao.showBalance();
	}

	public int deposit(double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(amount);
	}

	public int withdraw(double amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(amount);
	}

	public int fundTransfer(long accNo, double amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(accNo, amount);
	}
	
	public List printTransaction() {
		return dao.printTransaction();
	}
	

}
