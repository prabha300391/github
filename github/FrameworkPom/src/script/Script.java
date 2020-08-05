package script;



import org.openqa.selenium.By;

import functionallibraries.Base;
import pom.AddToCart;
import pom.Address;
import pom.Authentication;
import pom.Dresses;
import pom.MyAccount;
import pom.OrderSummary;
import pom.Payment;
import pom.Shipping;
import pom.SignIn;
import pom.SignOut;
import pom.Summary;

public class Script extends Base {
	
public static void main(String[] args) throws Throwable {
    
		
		launchBrowser("Chrome");
	     launchurl("http://automationpractice.com/");
	     SignIn a = new SignIn();
	     click(a.getSignin());
	     Thread.sleep(2000);
	     scrollintoview(driver.findElement(By.name("passwd")));
	     Authentication b = new Authentication();
	     sendkeys(b.getEmail(),"greens@gmail.com");
	     sendkeys(b.getPassword(), "prabha");;
	     click(b.getLoginbutton());
	     Thread.sleep(2000);
	     screenshot("MyAccount");
	     MyAccount c = new MyAccount();
	     sendkeys(c.getSearchField(), "dresses");
	     click(c.getSearchButton());
	     scrollintoview(driver.findElement(By.xpath("(//a[@class='product_img_link'])[1]")));
	     Thread.sleep(4000);
	     Dresses d = new Dresses();
	     click(d.getDress());
	     scrollintoview(driver.findElement(By.name("Submit")));
	     AddToCart e = new AddToCart();
	     click(e.getAddtocart());
	     Thread.sleep(2000);
	     click(e.getCheckout());
	     Thread.sleep(2000);
	     scrollintoview(driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")));
	     Summary f = new Summary();
	     click(f.getCheckout());
	     Thread.sleep(2000);
	     scrollintoview(driver.findElement(By.name("processAddress")));
	     Address g = new Address();
	     click(g.getCheckout());
	     Thread.sleep(2000);
	     scrollintoview(driver.findElement(By.name("processCarrier")));
	     Shipping h = new Shipping();
	     click(h.getCheckbox());
	     click(h.getCheckout());
	     Thread.sleep(2000);
	     scrollintoview(driver.findElement(By.xpath("//a[@title='Pay by bank wire']")));
	     Payment i = new Payment();
	     click(i.getPaybybank());
	     Thread.sleep(2000);
	     
	     OrderSummary j = new OrderSummary();
	     click(j.getConfirmorder());
	     Thread.sleep(2000);
	     scrollintoview(driver.findElement(By.xpath("//a[@title='Back to orders']")));
	     screenshot("confirmation");
	     SignOut k = new SignOut();
	     click(k.getSignout());
	     screenshot("signout");
	     
	     
	     
	     
	   
	     
	}

}



