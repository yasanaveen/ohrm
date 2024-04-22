package com.OrangeHrmTestCases;

import org.testng.annotations.Test;

import com.OrangeHrmWebPageObjects.OrangeHrmLoginPage;
import com.OrangeHrmWebPageObjects.PimPageObject;

public class Tc3_pimPageTest extends BaseTest {

	@Test
	public void pimPageTest() throws InterruptedException
	{

		OrangeHrmLoginPage oh= new OrangeHrmLoginPage(driver);
		oh.logindetails("admin", "NaveenYasa@12345");
		log.info("Entered userName & Password...");

		PimPageObject pom= new PimPageObject(driver);
		pom.pimMove();
		pom.clckAddEmployee();
		log.info("clicked on addEmployee...");
		pom.enterNames("Naveen", "Naidu", "Yasa");
		log.info("Enter employeeDetails...");
		Thread.sleep(2000);
		pom.printAttribute();
		pom.clickOnSasveButon();

	}
}
