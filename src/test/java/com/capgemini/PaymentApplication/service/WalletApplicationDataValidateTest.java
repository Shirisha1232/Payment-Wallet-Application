package com.capgemini.PaymentApplication.service;

import com.capgemini.PaymentApplication.bean.WalletApplicationData;

import junit.framework.TestCase;

public class WalletApplicationDataValidateTest extends TestCase {
	WalletApplicationData bean = new WalletApplicationData();
	WalletApplicationDataValidate validate = new WalletApplicationDataValidate();
	                                                                        

	public void testValidateFirstName() {
		bean.setFirstName("shirisha");
		assertNotNull(bean.getFirstName());
		assertEquals(false, validate.validateFirstName(bean.getFirstName()));
	}

	public void testValidateLastName() {
		bean.setLastName("burada");
		assertNotNull(bean.getLastName());
		assertEquals(false, validate.validateLastName(bean.getLastName()));
	}

	public void testValidateGender() {
		bean.setGender("Female");
		assertNotNull(bean.getGender());
		assertEquals(false, validate.validateGender(bean.getLastName()));
	}

	public void testValidateContact() {
		bean.setContact("7396648386");
		assertNotNull(bean.getContact());
		assertEquals(false, validate.validateContact(bean.getContact()));
	}

	public void testValidateEmail() {
		bean.setEmail("shirisha@gmail.com");
		assertNotNull(bean.getEmail());
		assertEquals(false, validate.validateEmail(bean.getEmail()));
	}

	public void testValidateAccNo() {
		bean.setAccNo(1256789021);
		assertNotNull(bean.getAccNo());
		assertEquals(false, validate.validateAccNo(bean.getAccNo()));
	}

	public void testValidateUserName() {
		bean.setUserName("Shirisha1232");
		assertNotNull(bean.getUserName());
		assertEquals(false, validate.validateUserName(bean.getUserName()));
	}

	public void testValidatePassword() {
		bean.setPassword("Siri@1234");
		assertNotNull(bean.getPassword());
		assertEquals(false, validate.validatePassword(bean.getPassword()));
	}

	public void testValidateTransId() {
		bean.setTransId(12345);
		assertNotNull(bean.getTransId());
		assertEquals(false, validate.validateTransId(bean.getTransId()));
	}

}
