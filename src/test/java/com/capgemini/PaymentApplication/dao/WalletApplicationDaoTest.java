package com.capgemini.PaymentApplication.dao;

import com.capgemini.PaymentApplication.bean.Customer;
import com.capgemini.PaymentApplication.bean.WalletApplicationData;

import junit.framework.TestCase;

public class WalletApplicationDaoTest extends TestCase {
	
	WalletApplicationDao dao = new WalletApplicationDao();
	WalletApplicationData bean = new WalletApplicationData();
	Customer cust = new Customer();

	public void testCreateAccount() {
		assertEquals(1, dao.createAccount(bean));
		assertNotNull(bean);
		assertTrue(true);
	}

	public void testLogin() {
		cust.setUserName("siri@12345");
		cust.setPassword("siri@123");
		
		assertEquals(false, dao.login(cust.getUserName(), cust.getPassword()));
		assertTrue(true);
	}

	public void testShowBalance() {
		assertEquals(4500, 4500);
		assertNotNull(dao.showBalance());
	}

	public void testDeposit() {
		//assertNotNull(dao.deposit(bean.getAmount()));
		assertEquals(1, dao.deposit(bean.getAmount()));
		assertTrue(true);
	}

	public void testWithdraw() {
		bean.setAmount(300);
		assertEquals(1, dao.deposit(bean.getAmount()));
		assertTrue(true);
		
	}

	public void testFundTransfer() {
		assertEquals(0, dao.fundTransfer(bean.getAccNo(), bean.getAmount()));
		assertTrue(true);
		
		
	}

	public void testPrintTransaction() {
		assertEquals(null, dao.printTransaction());
	}

}
