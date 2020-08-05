package functionallibraries;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	public static WebDriver driver; 
	
	
	public static void launchBrowser(String browser) {
		try {
			
			if (browser.equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\HAI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
				
				driver = new ChromeDriver();
				
			}
			
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
		
		
	
	public static void launchurl(String url) {
		try {
			
			driver.get(url);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public static void sendkeys(WebElement element , String value ) {
		try {
			element.clear();
			element.sendKeys(value);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void click(WebElement element) {
		try {
			element.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void screenshot(String name) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File f = ts.getScreenshotAs(OutputType.FILE);
			File f1 = new File("F:\\screenshot\\" + name + ".png");
			FileUtils.copyFile(f, f1);;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
   public static void dropdown(WebElement element,String option,String name) {
	   try {
		   Select s = new Select(element);
		   if (option.equalsIgnoreCase("index")) {
			   int i = Integer.parseInt(name);
			   s.selectByIndex(i);
			
		}else if (option.equalsIgnoreCase("value")) {
			s.deselectByValue(name);
			
		}else if (option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(name);
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}

	}
   
   public static void mousehover(WebElement element) {
	   try {
		   Actions ac = new Actions(driver);
			   ac.moveToElement(element).build().perform();
		
	      } catch (Exception e) {
           e.printStackTrace();	}}
	   
	public static void actionsclick(WebElement element) {	
		try {
			 Actions ac = new Actions(driver);
			 ac.click(element).build().perform();
			
		} catch (Exception e) {
           e.printStackTrace();		}}
	
    public static void actionssendkeys(WebElement element, String value) {
       try {
    	   element.clear();
    	   Actions ac = new Actions(driver);
    	   ac.sendKeys(element, value).build().perform();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
    
    public static void actionsdoubleclick(WebElement element) {
        try {
        	Actions ac=new Actions(driver);
        	ac.doubleClick(element).build().perform();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
    
    public static void actionsrightclick(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
			
		} catch (Exception e) {
         e.printStackTrace();		}

	}
			
		
			
			
		
   
  public static void alerts(String option ,String value) {
	  try {
		  Alert a = driver.switchTo().alert();
		  if (option.equalsIgnoreCase("simple")) {
			  a.accept();
			
		}else if (option.equalsIgnoreCase("confirm")) {
			a.accept();
			
		}else if (option.equalsIgnoreCase("prompt")) {
			a.sendKeys(value);
			a.accept();
			
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}

}
  
  public static void frame(WebElement element , String option,String value) {
	  try {
		  if (option.equalsIgnoreCase("id")) {
			  driver.switchTo().frame(value);
			
		}else if (option.equalsIgnoreCase("name")) {
			driver.switchTo().frame(value);
			
		}else if (option.equalsIgnoreCase("index")) {
			int i = Integer.parseInt(value);
			driver.switchTo().frame(i);
			
		}else if (option.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(element);
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}

}
	
  public static void scrollintoview(WebElement element ) {
	  try {
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView(true)", element);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
	
 
	public static void javascriptclick(WebElement element) {
		try {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
			
			} catch (Exception e) {
			e.printStackTrace();
		}
    
	}	
	
	public static void scrollup(WebElement element) {
		try {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
 
	}
	

}


