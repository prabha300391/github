package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class Shipping extends Base {
	
	@FindBy(name="cgv")
	private WebElement checkbox;
	
	@FindBy(name="processCarrier")
	private WebElement checkout;
	
	public WebElement getCheckbox() {
		return checkbox;
	}
	
	public WebElement getCheckout() {
		return checkout;
	}
	
	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}
	
	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}
	
	public Shipping() {
PageFactory.initElements(driver, this);	}
	

}
