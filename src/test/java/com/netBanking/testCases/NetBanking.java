package com.netBanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.netBanking.pageObjects.AddCustomerDetails;
import com.netBanking.pageObjects.EditCustomerDetails;
import com.netBanking.pageObjects.LoginPage;

public class NetBanking extends BaseClass {

	@Test
	public void addCustomer() throws Exception {
	
		logger.info("URL is Opened");
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(3000);
		lp.setUserName(username);
		logger.info("Username entered");
		lp.setPassword(password);
		logger.info("Password entered");
		lp.clickSubmit();
		AddCustomerDetails ac = new AddCustomerDetails(driver);
		ac.clickAddNewCustomer();
		logger.info("Providing customer Details...");
		ac.customerName("Pavani");
		ac.customerGender("Female");
		ac.customerDOB("06", "14", "1997");
		Thread.sleep(3000);
		ac.customerAddress("INDIA");
		ac.customerCity("HYD");
		ac.customerState("Telangana");
		ac.customerPinNo("5000074");
		ac.customerPhoneNo("9876543210");
		String email = randomestring()+"gmail.com";
		ac.customerEmailID(email);
		ac.customerPassword("mnopqr");
		ac.customerSubmit();
		Thread.sleep(3000);
		 ac.verifySuceessMsg(); 
		 logger.info("New customer details added");
		 
		
		
	}
	
	
	@Test
	public void editCustomerDetails() throws Exception {
		
		logger.info("URL is Opened");
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(3000);
		lp.setUserName(username);
		logger.info("Username entered");
		lp.setPassword(password);
		logger.info("Password entered");
		lp.clickSubmit();
		EditCustomerDetails ed = new EditCustomerDetails(driver);
		ed.entercustomerID();
		
	}
}
