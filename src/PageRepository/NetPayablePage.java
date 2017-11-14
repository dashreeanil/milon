package PageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NetPayablePage 
{
@FindBy(xpath="//input[@value='Continue as Swati']")
private WebElement continueAsBtn;
public void continueAsButton()
{
	continueAsBtn.click();
}
}
