package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class OrderSummary extends Base {
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmorder;
	
	public WebElement getConfirmorder() {
		return confirmorder;
	}
	public void setConfirmorder(WebElement confirmorder) {
		this.confirmorder = confirmorder;
	}
	public OrderSummary() {
PageFactory.initElements(driver, this);	}

}
