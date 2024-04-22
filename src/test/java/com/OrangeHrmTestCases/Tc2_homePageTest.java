package com.OrangeHrmTestCases;

import org.testng.annotations.Test;

import com.OrangeHrmWebPageObjects.Ohrm_homePage_objects;
import com.OrangeHrmWebPageObjects.OrangeHrmLoginPage;

public class Tc2_homePageTest extends BaseTest{
	
	@Test
	void homePageValidating() throws InterruptedException
	{
		OrangeHrmLoginPage login = new OrangeHrmLoginPage(driver);
		login.logindetails("admin", "NaveenYasa@12345");
		
		Ohrm_homePage_objects hm= new Ohrm_homePage_objects(driver);
		hm.validating_pageTittle();
		hm.validatingwelcomeadmin();
		
		
		
		
	}

}
