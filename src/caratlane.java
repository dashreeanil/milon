
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Project.general.BaseClass;
import com.Project.general.ExcelData;
import com.Project.general.SampleListener;
import com.Project.general.WebDriverCommonMethods;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageRepository.HomePage;
import PageRepository.JewelleryPage;
import PageRepository.KashishMangalsutraRingPage;
import PageRepository.MangalsutraRingsJewelleryPage;
import PageRepository.NetPayablePage;
import PageRepository.ProceedToCheckOutPage;


@Listeners(com.Project.general.SampleListener.class)
public class caratlane extends BaseClass
{
	
	WebDriverCommonMethods wdcm=new WebDriverCommonMethods();
	ExcelData edata=new ExcelData();
	
@Test
public void caratLaneTest() throws Throwable
{
	wdcm.waitForPageLoad();
	wdcm.windowMaximize();
	
	ExtentTest logger=extent.startTest("caratLaneTest");
	logger.log(LogStatus.INFO,"Navigate to HomePage");
	HomePage hm=PageFactory.initElements(BaseClass.driver,HomePage.class);
	//WebElement wb=driver.findElement(By.xpath("//nav[@class='queldorei default_menu']/div[2]/ul[1]/li[1]/a/span[text()='JEWELLERY']"));
	//It will move the mouse cursor into jewellery.
	hm.jewellery();
	logger.log(LogStatus.INFO,"Move the cursor near to Jewellery");
	Thread.sleep(3000);
	//wdcm.action(wb);
	//driver.findElement(By.xpath("//a[text()='Mangalsutra Rings']")).click();
	//It will navigate to MangalsutraRing page.
	JewelleryPage jwl=PageFactory.initElements(BaseClass.driver,JewelleryPage.class);
	jwl.mangalsutra();
	logger.log(LogStatus.INFO,"Navigate to MangalsutraRing page");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[@class='listing__products__image__load']")).click();
	//It will click on the first design of the mangalsutraring and navigate to another window.
	MangalsutraRingsJewelleryPage mrj=PageFactory.initElements(BaseClass.driver,MangalsutraRingsJewelleryPage.class);
	mrj.firstDesign();
	
//	Set<String> set=driver.getWindowHandles();
//	Iterator<String> it=set.iterator();
//	String parentId=it.next();
//	String childId=it.next(); 
//	driver.switchTo().window(childId);
	logger.log(LogStatus.INFO,"Navigate to KashishMangalsutraRingPage");
	
	String WinId = wdcm.getWindowIDs();
    String[] strArr =WinId.split(";");
    wdcm.switchToWindow(strArr[1]);
    logger.log(LogStatus.INFO,"Navigate to child window");
	//retrive the data from excel
	String value=edata.getExceldata("Sheet1",0,1);
	String pincode=edata.getExceldata("Sheet1",0,0);
	//pass the elements factoryinto kashishmangalsutrapage.
	KashishMangalsutraRingPage kmr=PageFactory.initElements(BaseClass.driver,KashishMangalsutraRingPage.class);
	kmr.kasishMangalsutraring(pincode, value);
	WebElement vsel=driver.findElement(By.xpath("//select"));
	wdcm.select(vsel,"16");
	Thread.sleep(2000);
	Select sel=new Select(vsel);
	sel.selectByValue("16");
	
	//driver.findElement(By.id("rgt__pin__code")).sendKeys(pincode);
	//driver.findElement(By.id("pd__container__buy__now")).click();
	Thread.sleep(3000);
	//It will navigate to NetPayable page
	ProceedToCheckOutPage ptc=PageFactory.initElements(BaseClass.driver,ProceedToCheckOutPage.class);
	ptc.proceedTOcheckout();
	logger.log(LogStatus.INFO,"Navigate to NetPayable Page");
	//driver.findElement(By.xpath("//input[@class='cart__footer__ordSum__btn__proceed']")).click();
	//It will Navigate to Delivery details page
	//driver.findElement(By.xpath("//input[@value='Continue as Swati']")).click();
	NetPayablePage npp=PageFactory.initElements(BaseClass.driver,NetPayablePage.class);
	npp.continueAsButton();
	logger.log(LogStatus.INFO,"Navigate to Delivery details page");
	wdcm.switchToWindow(strArr[0]);
	logger.log(LogStatus.INFO,"Navigate to parent window");
	//driver.switchTo().window(parentIExtentTest logger=extent.startTest("caratLaneTest");
	logger.log(LogStatus.INFO,"Navigate to HomePage");
	//img[@class='responsively-lazy hover__img' and @alt='Kashish Mangalsutra Ring']
	extent.endTest(logger);
	
}
}
