package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class Address extends Base {
	
		
		@FindBy(name="processAddress")
		private WebElement checkout;
		
		public WebElement getCheckout() {
			return checkout;
		}
		public void setCheckout(WebElement checkout) {
			this.checkout = checkout;
		}
		
		public Address() {
	PageFactory.initElements(driver, this);	}
		

	}

