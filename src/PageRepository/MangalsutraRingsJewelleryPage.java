package PageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MangalsutraRingsJewelleryPage 
{
@FindBy(xpath="//a[@class='listing__products__image__load']")
private WebElement FirstDesignLink;
public void firstDesign()
{
	FirstDesignLink.click();
}
}
