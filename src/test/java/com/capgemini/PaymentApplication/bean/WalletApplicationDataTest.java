package com.capgemini.PaymentApplication.bean;

import java.time.LocalDate;

import junit.framework.TestCase;

public class WalletApplicationDataTest extends TestCase {
	WalletApplicationData bean = new WalletApplicationData();

	public void testGetFirstName() {
		bean.setFirstName("shirisha");
		assertEquals("shirisha", bean.getFirstName());
		assertTrue("shirisha".equalsIgnoreCase(bean.getFirstName()));
		assertNotNull(bean);
		
	}

	public void testGetLastName() {
		bean.setLastName("burada");
		assertEquals("burada", bean.getLastName());
		assertTrue("burada".equalsIgnoreCase(bean.getLastName()));
		assertNotNull(bean);
	}

	public void testGetGender() {
		bean.setGender("female");
		assertFalse("male".equalsIgnoreCase(bean.getGender()));
		assertTrue("female".equalsIgnoreCase(bean.getGender()));
		
	}

	public void testGetContact() {
		bean.setContact("7396648386");
		assertFalse("7396642314".equalsIgnoreCase(bean.getContact()));
		assertTrue("7396648386".equalsIgnoreCase(bean.getContact()));
	}

	public void testGetEmail() {
		bean.setEmail("shirisha@gmail.com");
		assertEquals("shirisha@gmail.com", bean.getEmail());
	}

	public void testGetAge() {
		bean.setAge(23);
		assertEquals(23, bean.getAge());
	}

	public void testGetDate() {
		assertNull(bean.getDate());
		assertFalse(bean.getDate() == LocalDate.now());
		bean.setDate(LocalDate.now());
		assertEquals(LocalDate.now(), bean.getDate());
	}

	public void testGetAccNo() {
		bean.setAccNo(1234567890);
		assertTrue(1234567890 == bean.getAccNo());
		assertFalse(123490890 == bean.getAccNo());
		
	}

	public void testGetUserName() {
		bean.setUserName("Shirisha1232");
		assertEquals("Shirisha1232",bean.getUserName());
		
		
	}

	public void testGetPassword() {
		bean.setPassword("Siri@1232");
		assertEquals("Siri@1232",bean.getPassword());
		
	}

	public void testGetTransId() {
		bean.setTransId(12345);
		assertEquals(12345, bean.getTransId());
	}
	
	public void testGetAccount() {
		bean.setAmount(4500);
		assertFalse(5500 == bean.getAmount());
		assertTrue(4500 == bean.getAmount());
	}

}
