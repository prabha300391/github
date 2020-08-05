package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionallibraries.Base;

public class MyAccount extends Base {
	
	@FindBy(name="search_query")
	private WebElement SearchField;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement search;
	
	
	public WebElement getSearchField() {
		return SearchField;
	}
	
	public WebElement getSearchButton() {
		return search;
	}
	
	public void setSearchField(WebElement searchField) {
		SearchField = searchField;
	}
	
	public void setSearchButton(WebElement searchButton) {
		search = searchButton;
	}
	
	public MyAccount() {
		
      PageFactory.initElements(driver, this);	
      }



}
