package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class Dresses extends Base {
	
	@FindBy(xpath="//img[@title='Printed Summer Dress']")
	private WebElement dress;
	
	
	public WebElement getDress() {
		return dress;
	}
	
	
	public void setDress(WebElement dress) {
		this.dress = dress;
	}
	
	public Dresses() {
PageFactory.initElements(driver, this);	}

}



