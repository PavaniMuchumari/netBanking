package com.netBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.netBanking.pageObjects.LoginPage;
import com.netBanking.utilities.XLUtils;

public class Login001 extends BaseClass {
	
	@Test(dataProvider = "testData")
	public void loginDDT(String user,String pwd) {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		
		if(isAlertPresent()==true) {
			//close alert
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}else {
			Assert.assertTrue(true);
			logger.info("Login Passed");
			lp.clickLogout();
			driver.switchTo().alert().accept();  //close alert
			driver.switchTo().defaultContent();
		}
	}
	
	//User defined method created to check alert is present or not
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
	}
	
	@DataProvider(name="testData")
	String[][] getData() throws IOException{
		
		//String path = System.getProperty("user.dir"+"/src/test/java/com/netBanking/testData/testData.xlsx");
		String path = "C:\\Pavani_Workspace\\netBanking\\src\\test\\java\\com\\netBanking\\testData\\testData.xlsx";
		
		int rownum = XLUtils.getRowCount(path,"testdata");
		System.out.println("rowcount = "+rownum);
		int colnum = XLUtils.getCellCount(path,"testdata",1);
		System.out.println("colcount = "+colnum);
		String loginData[][] = new String[rownum][colnum];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colnum;j++) 
			{
				loginData[i-1][j] = XLUtils.getCellData(path,"testdata",i,j);
				
			}
		}
		System.out.println("LoginData ="+loginData);
		return loginData;
	}
}
