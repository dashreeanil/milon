package PageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KurtiPage {
@FindBy(xpath="//a[text()='Casual Kurtis")
private WebElement CausualKurtilink;
public void causualkurtiLink()
{
	CausualKurtilink.click();
}
}
