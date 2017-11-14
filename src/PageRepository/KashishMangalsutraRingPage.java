package PageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Project.general.WebDriverCommonMethods;

public class KashishMangalsutraRingPage 
{
	WebDriverCommonMethods wdcm=new WebDriverCommonMethods();
	@FindBy(xpath="//select")
	private WebElement DropDownBtn;
	@FindBy(id="rgt__pin__code")
	private WebElement pincodeEdit;
	@FindBy(id="pd__container__buy__now")
	private WebElement BuyNowBtn;
public void kasishMangalsutraring(String pincode,String value) throws InterruptedException
{
	wdcm.select(DropDownBtn, value);
	pincodeEdit.sendKeys(pincode);
	Thread.sleep(2000);
	BuyNowBtn.click();
	
}
}
