package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class Summary extends Base {
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkout;
	public WebElement getCheckout() {
		return checkout;
	}
	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}
	public Summary() {
PageFactory.initElements(driver, this);	}


}
