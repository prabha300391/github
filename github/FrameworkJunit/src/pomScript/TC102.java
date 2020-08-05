package pomScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseScript.Base;

public class TC102 extends Base{
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="hotels")
    private WebElement hotels;
	
	@FindBy(name="room_type")
	private WebElement roomtype;
	
	@FindBy(name="room_nos")
	private WebElement rooms;
	
	@FindBy(name="datepick_in")
	private WebElement checkin;
	
	@FindBy(name="datepick_out")
	private WebElement checkout;
	
	@FindBy(name="Submit")
	private WebElement submit;
	
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
	
	public WebElement getCheckin() {
		return checkin;
	}
	
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getRooms() {
		return rooms;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setCheckin(WebElement checkin) {
		this.checkin = checkin;
	}
	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}
    public void setHotels(WebElement hotels) {
	this.hotels = hotels;
    }
    public void setLocation(WebElement location) {
		this.location = location;
	}
    public void setRooms(WebElement rooms) {
		this.rooms = rooms;
	}
    public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}
    public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
    public TC102() {
    	PageFactory.initElements(driver, this);
	}
	
	
}
