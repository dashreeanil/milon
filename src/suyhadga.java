import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Project.general.BaseClass;

public class suyhadga extends BaseClass{
	@Test
	public void CraftsvillaTest() throws InterruptedException{
		
	System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/Software/chromedriver");
	 driver=new ChromeDriver();
		
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			//driver.get("http://www.craftsvilla.com/");
			Thread.sleep(3000);
			WebElement wb=driver.findElement(By.xpath("//nav[@id='mega-menu']/div/ul/li[3]/a/span"));
			Actions act=new Actions(driver);
			act.moveToElement(wb).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Casual Kurtis']")).click();
			driver.findElement(By.xpath("//div[@id='listProducts']/div[1]/div/div[1]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='L']")).click();
			driver.findElement(By.id("pincode_value")).sendKeys("560017");
			Thread.sleep(3000);
			//driver.findElement(By.id("addtocart")).click();
			driver.findElement(By.id("buynow")).click();
			driver.findElement(By.id("address-email")).sendKeys("sahumilon@gmail.com");
			driver.findElement(By.id("address-first-name")).sendKeys("milon");
			driver.findElement(By.id("address-last-name")).sendKeys("sahu");
			driver.findElement(By.id("address-pincode")).sendKeys("560017");
			driver.findElement(By.id("address-textbox")).sendKeys("kashinagar");
			driver.findElement(By.id("address-mThread.sleep(2000);obileno")).sendKeys("9778003598");
			Thread.sleep(2000);
			driver.findElement(By.id("address-form-submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),PLACE)]")).click();
			
			
			
			
			
		}
		
	}


