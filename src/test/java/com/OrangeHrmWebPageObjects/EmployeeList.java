package com.OrangeHrmWebPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeList {
	
	 public WebDriver driver;

	public EmployeeList(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "PIM")
	WebElement pimPage;
	
	@FindBy(id = "menu_pim_viewEmployeeList") WebElement employeeList;
	
	public void PimMovetoEmployeeList() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(pimPage).build().perform();
		Thread.sleep(2000);
	}
	
	public void clickEmployelist()
	{
		employeeList.click();
	}
	

	
}
