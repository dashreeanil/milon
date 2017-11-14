package com.Craftsvilla.PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Project.general.BaseClass;
import com.Project.general.Constants;
import com.Project.general.WebDriverCommonMethods;

public class Homepage implements Constants
{
	WebDriverCommonMethods wdcm=new WebDriverCommonMethods();
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement signInlink;
	
	public void signIn() throws InterruptedException
	{
		signInlink.click();
		Thread.sleep(3000);
		BaseClass.driver.findElement(By.id("emailId")).sendKeys(username);
		BaseClass.driver.findElement(By.id("continueBtn")).click();
		Thread.sleep(3000);
		BaseClass.driver.findElement(By.id("userPassword")).sendKeys(password);
		BaseClass.driver.findElement(By.id("loginCheck")).click();
	}
	@FindBy(xpath="//a[@class='dropdown dropdown-toggle']/i[2]")
	private WebElement signOutLink;
	
	public void signOut() throws InterruptedException
	{
		signOutLink.click();
		BaseClass.driver.findElement(By.xpath("//a(@href='/customer/account/logout')")).click();
		Thread.sleep(3000);
		BaseClass.driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[11]/a")).click();
	}
	

}
