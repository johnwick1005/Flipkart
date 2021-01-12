package org.test;

import java.security.KeyStore.Entry.Attribute;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample {
	
	
	public WebDriver driver;
	

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sam10\\eclipse-workspace\\TestNG\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();

	}
	
	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	
//	Assert
	@Test
	private void tc1() {
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"), "check the title");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("java");
		String attribute = txtEmail.getAttribute("value");
		Assert.assertEquals(attribute, "Java", "check the username");
		
		driver.findElement(By.id("pass")).sendKeys("abhgf232");
		
		driver.findElement(By.name("login")).click();
		WebElement txtEmail2 = driver.findElement(By.id("email"));
		txtEmail.sendKeys("java");
		String attribute2 = txtEmail.getAttribute("value");
		WebElement txtEmail1 = driver.findElement(By.id("email"));
		txtEmail.sendKeys("java");
		String attribute1 = txtEmail.getAttribute("value");
        Assert.assertEquals(attribute, "Java", "check the username");
		
		driver.findElement(By.id("pass")).sendKeys("abhgf232");
		
		driver.findElement(By.name("login")).click();

		

		
		
		

	}
	
	
//	SoftAssert
   @Test
   private void tc2() {
	
	   driver.get("https://www.facebook.com/");
	   
	   String url = driver.getCurrentUrl();
	   
	   SoftAssert s = new SoftAssert();
	   s.assertTrue(url.contains("facebook"), "check the url");
	   
	   WebElement txtEmail = driver.findElement(By.id("email"));
	   txtEmail.sendKeys("Selenium");
	   
	   String attribute = txtEmail.getAttribute("value");
	   s.assertEquals(attribute, "selenium", "check the username");
	   
	   
	   driver.findElement(By.id("pass")).sendKeys("shgg242");
	   
	   driver.findElement(By.name("login")).click();
	   
	   s.assertAll();
	   
}
	
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

