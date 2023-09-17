package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectLocators {

	webDriver Drive;
	private ChromeDriver driver;
	@BeforeTest
	
	public void openFacebook () {
	
		WebDriverManager.chromedriver () .setup () ;
		driver = new ChromeDriver ();
		driver.manage () .window () .maximize () ;
		driver.manage () . timeouts () . implicitlyWait (Duration.ofSeconds (10)) ;
		driver.get ("https://www.facebook.com/");

	}
	
	@Test 
	Run Debug
	public void idLocatorsTest() {
	Driver.findElement(By.id("Email")).sendKey("hill";)
	}
	
	public void NameLocatorsTest() {
		
	}
	public void nameLocatorsTest() {
		
		Driver.findElement(By.linkText("Forgot password?")).click(;)
		/*
		<a href="https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjk0MzU2ODAxLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;ars=facebook_login">Forgot password?</a>
	*/
		//tag==a
			//link test=> Forget Password?<==between two angel (><)
		
	}
	
	public void partialLinkTextLocatorsText() {
		// if link text is too big
		 // if link text has space in between 
		// if link text has number in between 
		// then it is better use partial link text
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot password?")).click();
	}
	
	}
