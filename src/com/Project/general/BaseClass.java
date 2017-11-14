package com.Project.general;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Craftsvilla.PageObjectRepository.Homepage;
import com.relevantcodes.extentreports.ExtentReports;

import PageRepository.HomePage;

public class BaseClass implements Constants
{
	public static WebDriver driver;
	public ExtentReports extent; 
	WebDriverCommonMethods wdcm=new WebDriverCommonMethods();
	/*@BeforeSuite
	public void configBeforeSuite()
	{
		extent=new ExtentReports("./test-output/customreport.html");
		extent.loadConfig(new File("./Resourses/extent-config.xml"));
				
	}
	@AfterSuite
	public void configAfterSuite()
	{
		extent.flush();
		extent.close();
	}*/
	
	@BeforeClass
	public void configBeforeClass()
	{
	Reporter.log("Open Browser",true);
	if(Constants.browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/Software/chromedriver");
		driver=new ChromeDriver();
	}
	else 
	{
		System.setProperty("webdriver.firefox.driver","/home/tyss/Desktop/Software/geckodriver");
		driver=new FirefoxDriver();
	}
	}
	@BeforeMethod
	public void configBeforeMethod() throws Throwable
	{
	Reporter.log("Login",true);
	driver.get(url);
	Thread.sleep(3000);
	
	//driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	Homepage hm=PageFactory.initElements(BaseClass.driver,Homepage.class);
	hm.signIn();
	
	/*Thread.sleep(3000);
	driver.findElement(By.id("emailId")).sendKeys(username);
	driver.findElement(By.id("continueBtn")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("userPassword")).sendKeys(password);
	driver.findElement(By.id("loginCheck")).click();*/
	}
	@AfterMethod
	public void configAfterMethod() throws Throwable
	{
	Reporter.log("Logout",true);
	/*HomePage hm=PageFactory.initElements(BaseClass.driver,HomePage.class);
	hm.signOut();*/
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='dropdown dropdown-toggle']/i[2]")).click();
	
	
	//driver.findElement(By.xpath("//a[text()=' My Account']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[11]/a")).click();
	}
	@AfterClass
	public void configAfterClass()
	{
	Reporter.log("Close Browser",true);
	driver.quit();
	}
}
