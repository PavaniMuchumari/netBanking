package com.netBanking.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver ldriver;
	 public LoginPage(WebDriver rdriver){
		 
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
		  
		  }
	public By USER_NAME = By.name("uid"); 
	public By PASSWORD = By.name("password"); 
	public By LOGIN_BUTTON = By.name("btnLogin"); 
	public By LOGOUT = By.xpath("//a[text()='Log out']");
	
		
	public void setUserName(String uname){	
		ldriver.findElement(USER_NAME).sendKeys(uname);
	}
	public void setPassword(String pwd) {
		ldriver.findElement(PASSWORD).sendKeys(pwd);
	}
	public void clickSubmit() {
		ldriver.findElement(LOGIN_BUTTON).click();
	}
	
	public void clickLogout() {
		ldriver.findElement(LOGOUT).click();
	}
}
