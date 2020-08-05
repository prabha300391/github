package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class SignIn extends Base {
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;

	public WebElement getSignin() {
	return signin;
}

	public void setSignin(WebElement signin) {
	this.signin = signin;
}
	public SignIn() {

		PageFactory.initElements(driver, this);	
}

}
