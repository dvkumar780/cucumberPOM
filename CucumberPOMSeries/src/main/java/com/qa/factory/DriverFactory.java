package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver>tldriver=new ThreadLocal<>();
	
	//this method is used to initialize the threadlocal driver  on the basis of given browser
	//it will return tldriver
	public WebDriver init_driver(String browser)
	{
		System.out.println("Browser value is :"+browser);
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}
		else
		{
			System.out.println("pass the correct browser value"+browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	//THIS IS USED TO GET THE DRIVER WITH TLDRIVER

	public static synchronized WebDriver getDriver()
	{
		return tldriver.get();
	}
}
