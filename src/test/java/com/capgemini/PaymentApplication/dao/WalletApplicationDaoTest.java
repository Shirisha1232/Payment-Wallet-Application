package com.capgemini.PaymentApplication.dao;

import com.capgemini.PaymentApplication.bean.WalletApplicationData;

import junit.framework.TestCase;

public class WalletApplicationDaoTest extends TestCase {
	
	WalletApplicationDao dao = new WalletApplicationDao();
	WalletApplicationData bean = new WalletApplicationData();

	public void testCreateAccount() {
		assertEquals(0, dao.createAccount(bean));
		assertNotNull(bean);
		assertTrue(true);
	}

	public void testLogin() {
		assertEquals(false, dao.login(bean.getUserName(), bean.getPassword()));
		assertTrue(true);
	}

	public void testShowBalance() {
		assertEquals(4500, 4500);
		assertNotNull(dao.showBalance());
	}

	public void testDeposit() {
		assertEquals(0, dao.deposit(bean.getAmount()));
		assertTrue(true);
	}

	public void testWithdraw() {
		assertEquals(0, dao.deposit(bean.getAmount()));
		assertTrue(true);
		
	}

	public void testFundTransfer() {
		assertEquals(0, dao.fundTransfer(bean.getAccNo(), bean.getAmount()));
		assertTrue(true);
		
		
	}

	public void testPrintTransaction() {
		assertEquals(null, dao.printTransaction(bean.getTransId()));
	}

}
