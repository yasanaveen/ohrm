package com.OrangeHrmTestCases;

import org.testng.annotations.Test;

import com.OrangeHrmWebPageObjects.EmployeeList;
import com.OrangeHrmWebPageObjects.OrangeHrmLoginPage;

public  class Tc4_employeeList extends BaseTest {

	@Test
	public void valiatingEmloyeeList() throws InterruptedException
	{
		OrangeHrmLoginPage login = new OrangeHrmLoginPage(driver);
		login.logindetails("admin", "NaveenYasa@12345");
		log.info("entered uname & Pssword..");

		EmployeeList em = new EmployeeList(driver);
		em.PimMovetoEmployeeList();
		log.info("moved to employeeList");
		em.clickEmployelist();
		log.info("clicked on employeelist..");
	}

}
