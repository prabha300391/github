package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class Payment extends Base {

	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement paybybank;
	
	public WebElement getPaybybank() {
		return paybybank;
	}
	public void setPaybybank(WebElement paybybank) {
		this.paybybank = paybybank;
	}
	public Payment() {
PageFactory.initElements(driver, this);	}
}
