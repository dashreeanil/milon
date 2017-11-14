

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Project.general.BaseClass;
import com.Project.general.WebDriverCommonMethods;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageRepository.HomePage;
@Listeners(com.Project.general.SampleListener.class)
public class caratlane2 extends BaseClass
{
	WebDriverCommonMethods wdcm=new WebDriverCommonMethods();
	@Test
	public void caratLaneTest2() throws InterruptedException
	{
		wdcm.waitForPageLoad();
		wdcm.windowMaximize();


		HomePage hm=PageFactory.initElements(BaseClass.driver,HomePage.class);
		hm.goldJewellery();
		Thread.sleep(3000);
	public void nsdg(int index)
	{
	ArrayList<String> a=new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(a.get(index));
	}
}
}