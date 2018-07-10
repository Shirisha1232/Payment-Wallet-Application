package com.capgemini.PaymentApplication.service;

import com.capgemini.PaymentApplication.bean.WalletApplicationData;

public class WalletApplicationService implements  IWalletApplicationService{
	
	public int createAccount(WalletApplicationData bean) {
		return 0;
	}

	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public double showBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deposit(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int withdraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int fundTransfer(long accNo, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public WalletApplicationData printTransaction(long transId) {
		return null;
	}
	

}
