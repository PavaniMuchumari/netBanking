package com.netBanking.pageObjects;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddCustomerDetails {

	WebDriver ldriver;
	 public AddCustomerDetails(WebDriver rdriver){
		 
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
		  
		  }
	
	public By NEW_CUSTOMER = By.xpath("//a[text()='New Customer']");
	public By CUSTOMER_NAME = By.xpath("//input[@name='name']");
	public By GENDER_BUTTON = By.xpath("//input[@value='f']");
	public By DATE_OF_BIRTH = By.xpath("//input[@name='dob']");
	public By ADDRESS = By.xpath("//textarea[@name='addr']");
	public By CITY = By.xpath("//input[@name='city']");
	public By STATE = By.xpath("//input[@name='state']");
	public By PIN_NO = By.xpath("//input[@name='pinno']");
	public By MOBILE_NO = By.xpath("//input[@name='telephoneno']");
	public By EMAIL_ID = By.xpath("//input[@name='emailid']");
	public By PASSWORD = By.xpath("//input[@name='password']");
	public By SUBMIT= By.xpath("//input[@value='Submit']");
	public By SUCCESS_MSG = By.xpath("//p[@class='heading3']");
	public By GET_CUSTOMERID_VALUE = By.xpath("(//table[@id='customer']//tr/td)[5]");
	
	// String getCustomerID="";
	
	public void clickAddNewCustomer() {
		ldriver.findElement(NEW_CUSTOMER).click();
	}
	public void customerName(String cname)
	{
		ldriver.findElement(CUSTOMER_NAME).sendKeys(cname);
	}
	public void customerGender(String cgender)
	{
		ldriver.findElement(GENDER_BUTTON).click();
	}
	
	public void customerDOB(String mm,String dd,String yy) {
		ldriver.findElement(DATE_OF_BIRTH).sendKeys(mm);
		ldriver.findElement(DATE_OF_BIRTH).sendKeys(dd);
		ldriver.findElement(DATE_OF_BIRTH).sendKeys(yy);
	}
	
	public void customerAddress(String caddress)
	{
		ldriver.findElement(ADDRESS).sendKeys(caddress);
	}

	public void customerCity(String ccity)
	{
		ldriver.findElement(CITY).sendKeys(ccity);
	}
	public void customerState(String cstate)
	{
		ldriver.findElement(STATE).sendKeys(cstate);
	}
	public void customerPinNo(String cpinno)
	{
		ldriver.findElement(PIN_NO).sendKeys(String.valueOf(cpinno));
	}
	public void customerPhoneNo(String cphoneno)
	{
		ldriver.findElement(MOBILE_NO).sendKeys(cphoneno);
	}
	public void customerEmailID(String cemailid)
	{
		ldriver.findElement(EMAIL_ID).sendKeys(cemailid);
	}
	public void customerPassword(String cpassword)
	{
		ldriver.findElement(PASSWORD).sendKeys(cpassword);
	}
	public void customerSubmit()
	{
		ldriver.findElement(SUBMIT).click();
	}
	
	
	public void verifySuceessMsg() {
		 String Text = ldriver.findElement(SUCCESS_MSG).getText();
		 System.out.println(Text);
		 Assert.assertEquals(Text, "Customer Registered Successfully!!!");
		// getCustomerID = ldriver.findElement(GET_CUSTOMERID_VALUE).getText();
		//System.out.println("CustomerID = "+getCustomerID);

		
	}
}
