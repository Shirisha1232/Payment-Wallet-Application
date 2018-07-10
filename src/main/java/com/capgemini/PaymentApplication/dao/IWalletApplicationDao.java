package com.capgemini.PaymentApplication.dao;

import com.capgemini.PaymentApplication.bean.WalletApplicationData;

public interface IWalletApplicationDao {
	public int createAccount(WalletApplicationData bean);
	public boolean login(String username, String password);
	public double showBalance();
	public int deposit(double amount);
	public int withdraw(double amount);
	public int fundTransfer(long accNo, double amount);
	public WalletApplicationData printTransaction(long transId);

}
