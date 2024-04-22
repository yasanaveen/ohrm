package com.OrangeHrmTestCases;

import org.testng.annotations.Test;

import com.OrangeHrmWebPageObjects.OrangeHrmLoginPage;

public class Tc_001OrangeHrm_LoginPageTestCase extends BaseTest{

	@Test
	public void OrangeHrm_LoginPage_Test() throws InterruptedException
	{

		OrangeHrmLoginPage login= new OrangeHrmLoginPage(driver);

		login.validatingLogo();
		log.info("logo is isDisplayed..");
		login.validatingloginpanel();
		log.info("LoginPanel text is printed..");
		login.logindetails("admin", "NaveenYasa@12345");
		log.info("Enterd userName & password..");

	}



}
