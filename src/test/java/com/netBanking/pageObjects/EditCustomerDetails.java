package com.netBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerDetails {


	WebDriver ldriver;
	 public EditCustomerDetails(WebDriver rdriver){
		 
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
		  
		  }
	 
	 public By EDIT_CUSTOMER = By.xpath("//a[text()='Edit Customer']");
	 public By CUSTOMER_TEXTBOX = By.xpath("//input[@name='cusid']");
	 public By SUBMIT = By.xpath("//input[@value='Submit']");
	 
	 
	 public void entercustomerID() {
		 
		 AddCustomerDetails ac = new AddCustomerDetails(ldriver);
		// String id = ac.getCustomerID;
		// System.out.println(id);
		 ldriver.findElement(EDIT_CUSTOMER).click();
		// ldriver.findElement(CUSTOMER_TEXTBOX).sendKeys(id);
		 ldriver.findElement(SUBMIT).click();
	 }
	 
	 public void editExistingCustomerDetails() {
	
		 
		 
	 }
	 
}
