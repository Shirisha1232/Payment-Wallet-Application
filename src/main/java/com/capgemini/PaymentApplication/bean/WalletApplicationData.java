package com.capgemini.PaymentApplication.bean;

import java.time.LocalDate;

public class WalletApplicationData {
	private String firstName;
	private String lastName;
	private String gender;
	private String contact;
	private String email;
	private int age;
	private LocalDate date;
	private long accNo;
	private String userName;
	private String password;
	private long transId;
	private double amount;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getTransId() {
		return transId;
	}
	public void setTransId(long transId) {
		this.transId = transId;
	}
	@Override
	public String toString() {
		return "WalletApplicationData [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", contact=" + contact + ", email=" + email + ", age=" + age + ", date=" + date + ", accNo=" + accNo
				+ ", userName=" + userName + ", password=" + password + ", transId=" + transId + "]";
	}
	
	

}
