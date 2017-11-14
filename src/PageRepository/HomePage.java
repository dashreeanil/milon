package PageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Project.general.BaseClass;
import com.Project.general.Constants;
import com.Project.general.WebDriverCommonMethods;

public class HomePage implements Constants
{
	WebDriverCommonMethods wdcm=new WebDriverCommonMethods();
	
	@FindBy(xpath="//span[text()='JEWELLERY']")
	private WebElement jewellerylink;
	public void jewellery() throws InterruptedException
	{
		wdcm.action(jewellerylink);
		Thread.sleep(3000);
	}
	@FindBy(xpath="//span[text()='GOLD JEWELLERY']")
	private WebElement goldJewelleryLink;
	public void goldJewellery() throws InterruptedException
	{
		wdcm.action2(goldJewelleryLink);
		Thread.sleep(3000);
	}

}
