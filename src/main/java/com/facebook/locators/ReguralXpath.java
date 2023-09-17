package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReguralXpath {

	
	WebDriver Driver;  
	
	public void openFacebook () {
			WebDriverManager.chromedriver () .setup ();
			 WebDriver driver = new ChromeDriver () ;
			 driver.get ("https://www.facebook.com/");
			driver.manage () .window () . maximize () ;
			driver.manage () . timeouts () . implicitlyWait (Duration.ofSeconds (10)) ;
			driver.get("https://www.facebook.com/");
			
			
		}
	
	
		public void loginTest () {
			By drive;
			drive.findElement((SearchContext) By.xpath("input[@id=email")).sendKeys("jkj");
			
			//drive.findElement(By.expath["@name='pass']")).clear();
		//	drive.findElement(By.expath["@name='pass']")).sendKeys("hkhh");
			
			WebElement password=drive.findElement(By.xpath(//*)["@name='pass']"));
			//password local variable 
			password.sendKeys("hkhh");
	
		
		
		}