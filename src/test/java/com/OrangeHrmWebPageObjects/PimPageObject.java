package com.OrangeHrmWebPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPageObject {


	public static WebDriver driver;

	public PimPageObject(WebDriver d) 
	{
		driver=d;
		PageFactory.initElements(driver,this);
	}

	@FindBy(linkText = "PIM")
	WebElement pimPage;
	
	@FindBy(id = "menu_pim_addEmployee")
	WebElement addEmployee;
	
	@FindBy(id = "firstName") WebElement firstName;
	@FindBy(id= "middleName") WebElement middleName;
	@FindBy(id = "lastName") WebElement lastName;
	@FindBy(name = "employeeId") WebElement attribute;
	@FindBy(id = "btnSave") WebElement saveButton;
	
	
	
	


	public void pimMove() throws InterruptedException
	{
       Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(pimPage).build().perform();

	}
	
	public void clckAddEmployee()
	{
		addEmployee.click();
	}
	
	public void enterNames(String fName, String mName,String Lname)
	{
		firstName.sendKeys(fName);
		middleName.sendKeys(mName);
		lastName.sendKeys(Lname);
		
	}
	
	public void printAttribute()
	{
		System.out.println("The value of :"+attribute.getAttribute("value"));
	}
	
	public void clickOnSasveButon()
	{
		saveButton.click();
	}


}
