package com.OrangeHrmTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHrmWebPageObjects.OrangeHrmLoginPage;
import com.orangehrm.utills.XLUtils;

import junit.framework.Assert;

public class Tc_LoginDDT extends BaseTest {
	
	
	@Test(dataProvider = "loginData")
	public void loginDDT(String uName,String pwd) throws InterruptedException
	{
		OrangeHrmLoginPage lp= new OrangeHrmLoginPage(driver);
		lp.logindetails(uName, pwd);
		log.info("enter u&p..");
		lp.clickLogout();
		log.info("loggedout..");
		
//       boolean res=driver.getPageSource().contains("Invalid credentials");
//       if(res==true)
//       {
//    	   Assert.assertTrue(true);
//       }
//       else
//       {
//    	   Assert.assertTrue(false);
//       }
//		
	}
	
	
	@DataProvider(name="loginData")
	String [][]gatData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/orangehrm/testData/Data.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "sheet1");
		int colcount=XLUtils.getCellCount(path, "sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
			  logindata[i-1][j]=XLUtils.getCellData(path, "sheet1", i,j);	
			}
		}
		return logindata;
		
	}

}
