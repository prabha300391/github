package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class Authentication extends Base {

	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="passwd")
	private WebElement password;
	
	@FindBy(name="SubmitLogin")
	private WebElement loginbutton;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}
	public Authentication() {
   PageFactory.initElements(driver, this);	}

}
