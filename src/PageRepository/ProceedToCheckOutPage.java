package PageRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProceedToCheckOutPage 
{
@FindBy(xpath="//input[@class='cart__footer__ordSum__btn__proceed']")
private WebElement proceedToCheckoutBtn;
public void proceedTOcheckout()
{
	proceedToCheckoutBtn.click();
}
}
