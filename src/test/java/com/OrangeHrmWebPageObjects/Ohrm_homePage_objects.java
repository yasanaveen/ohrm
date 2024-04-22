package com.OrangeHrmWebPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Ohrm_homePage_objects {

	public WebDriver driver;

	public Ohrm_homePage_objects(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver,this);
	}


	public void validating_pageTittle()
	{
		String Actualtittle= driver.getTitle();
		System.out.println("ActualTitle is:"+Actualtittle);
		
		String ExpectedTittle="OrangeHRM";
		System.out.println("ExpectedTittleis:"+ExpectedTittle);
		
		if(ExpectedTittle.equals(Actualtittle))
		{
			System.out.println("the tittle is Matched PASS");
		}
		else
		{
			System.out.println("the tittle is not matched Fail");
		}
		
		
		
	}

	@FindBy(id = "welcome")
	WebElement wecomeadminPage;
	
	
	
	
	public void validatingwelcomeadmin()
	{
		System.out.println(wecomeadminPage.getText());
		wecomeadminPage.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
