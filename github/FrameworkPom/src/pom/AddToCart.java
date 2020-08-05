package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class AddToCart extends Base {
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout;
	
	public WebElement getAddtocart() {
		return addtocart;
	}
	
	public WebElement getCheckout() {
		return checkout;
	}
	public void setAddtocart(WebElement addtocart) {
		this.addtocart = addtocart;
	}
	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}
	public AddToCart() {
PageFactory.initElements(driver, this);	}


}
