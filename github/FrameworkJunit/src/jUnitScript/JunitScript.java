package jUnitScript;


import org.junit.*;

import baseScript.Base;
import pomScript.TC101;
import pomScript.TC102;
import pomScript.TC104;

public class JunitScript extends Base {

	  @BeforeClass
	public static void beforeclass() {
		
		launchBrowser("chrome");
		launchurl("http://adactinhotelapp.com/index.php");
	}
	@Test
	@Ignore
	public void test1() {
		TC101 a = new TC101();
		sendkeys(a.getUsername(), "prabha30");
		sendkeys(a.getPassword(), "prabhakar");
		click(a.getLogin());
	}
	@Test
	@Ignore
	public void test2() {
		TC102 b = new TC102();
		sendkeys(b.getUsername(), "prabha30");
		sendkeys(b.getPassword(), "prabhakar");
		click(b.getLogin());
		dropdown(b.getLocation(), "value", "Sydney");
		dropdown(b.getHotels(), "value", "Hotel Creek");
		dropdown(b.getRoomtype(), "value", "Standard");
		dropdown(b.getRooms(), "value", "1");
		sendkeys(b.getCheckin(),"09/07/2020" );
		sendkeys(b.getCheckout(), "07/07/2020");
		click(b.getSubmit());
		

	}
	@Test
	
	public void test3() {
		TC104 c= new TC104();
		sendkeys(c.getUsername(), "prabha30");
		sendkeys(c.getPassword(), "prabhakar");
		click(c.getLogin());
		dropdown(c.getLocation(), "value", "Sydney");
		dropdown(c.getHotels(), "value", "Hotel Creek");
		dropdown(c.getRoomtype(), "value", "Standard");
		dropdown(c.getRooms(), "value", "1");
		sendkeys(c.getCheckin(),"02/07/2020" );
		sendkeys(c.getCheckout(), "03/07/2020");
		click(c.getSubmit());
		isdisplayed(c.getHotelcreek());
		
		

	}
	@AfterClass
	public static void afterclass() {
	 driver.close();

	}
	
	
	

}
