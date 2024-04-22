package com.OrangeHrmWebPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHrmTestCases.BaseTest;


public class OrangeHrmLoginPage  {


	public WebDriver driver;

	public OrangeHrmLoginPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver,this);
	}


	@FindBy(xpath = "//*[@id=\"divLogo\"]/img")
	WebElement OhrmLogo;

	@FindBy(id =  "logInPanelHeading") 
	WebElement loginPanelText;

	@FindBy(id = "txtUsername")
	WebElement userName;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement loginbutton;
	
	@FindBy(id = "welcome") WebElement wlcomeadminclick;
	@FindBy(linkText = "Logout") WebElement logoutclick;


	public void validatingLogo()
	{
		boolean logo=OhrmLogo.isDisplayed();
		System.out.println("The Logo is Matched: "+logo);
		//Log.info("logo is displayed"+logo);
	}

	public void validatingloginpanel()
	{
		System.out.println("The Login_PanelLogin_Text is: "+loginPanelText.getText());
		//Log.info("loginPanel_Text_isMatched:"+loginPanelText.getText());
	}

	public void logindetails(String uName,String pwd) throws InterruptedException
	{
		userName.sendKeys(uName);
		password.sendKeys(pwd);
         Thread.sleep(2000);
		loginbutton.click();
		
		Thread.sleep(2000);
	}
	
	public void clickLogout() throws InterruptedException
	{
		wlcomeadminclick.click();
		Thread.sleep(2000);
		logoutclick.click();
	}




}
