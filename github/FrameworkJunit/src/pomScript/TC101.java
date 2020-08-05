package pomScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseScript.Base;

public class TC101 extends Base {
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}
	
	public void setUsername(WebElement username) {
		this.username = username;
	}
	
	public void setPassword(WebElement password) {
		this.password = password;
	}
	
	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	public TC101() {
       PageFactory.initElements(driver,this);	}

}
