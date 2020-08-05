package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class SignOut extends Base {
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signout;
	
	public WebElement getSignout() {
		return signout;
	}
	public void setSignout(WebElement signout) {
		this.signout = signout;
	}
	public SignOut() {
PageFactory.initElements(driver, this);	}

}
