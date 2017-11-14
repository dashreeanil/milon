package Craftsvilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Project.general.BaseClass;
import com.Project.general.ExcelData;
import com.Project.general.WebDriverCommonMethods;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class CraftsvillaSaree extends BaseClass {
	
	ExcelData edata=new ExcelData();
	@Test
	public void craftsvillaSareeTest() throws InterruptedException
	{
		WebDriverCommonMethods wdcm=new WebDriverCommonMethods();
		wdcm.waitForPageLoad();
		wdcm.windowMaximize();
		Thread.sleep(2000);
		/*WebElement wb=driver.findElement(By.xpath("//nav[@id='mega-menu']/div/ul/li[4]/a"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();*/
		
	}

}
