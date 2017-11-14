package PageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewelleryPage 
{
@FindBy(xpath="//a[text()='Mangalsutra Rings']")
private WebElement MangalsutraLink;
public void mangalsutra()
{
	MangalsutraLink.click();
}
}
