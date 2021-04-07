package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//1.maintain the by locator
	//2.maintain constructor
	//maintain page actions
	//will be using the concept of encapsulation
	
	private WebDriver driver;
	private By  uname=By.id("email");
	private By  psword=By.id("passwd");
	private By  login=By.id("SubmitLogin");
	private By  forgotpassword=By.xpath("//a[contains(text(),'Forgot your password?')]");
	
	//constructor
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	//page actions
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isForgotLinkExist()
	{
		return driver.findElement(forgotpassword).isDisplayed();
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(uname).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(psword).sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
	
}
