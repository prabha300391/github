package org.prabha;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium extends Base{
	
	public static void main(String[] args) throws Throwable {
		
		launchBrowser("chrome");
		launchurl("https://www.flipkart.com/");
		sendkeys(driver.findElement(By.xpath("(//input[@type='text'])[2]")), "7418416201");
		sendkeys(driver.findElement(By.xpath("//input[@type='password']")), "prabha");
		click(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));
		Thread.sleep(4000);
		click(driver.findElement(By.xpath(" (//li[@class='Wbt_B2 _1YVU3_'])[1]")));
		Thread.sleep(2000);
		mousehover(driver.findElement(By.xpath("(//li[@class='_1KCOnI _3ZgIXy'])[3]")));
		Thread.sleep(2000);
		click(driver.findElement(By.xpath("(//li[@class='_1KCOnI _3ZgIXy'])[3]")));
		
		
		
		
		
		
			
		
	}			
				
			}
		
		
	
