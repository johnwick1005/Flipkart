package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class A {

	public WebDriver driver;
	
	
	@Parameters("browser")
	@Test
	private void tc1(String browserName) {
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam10\\eclipse-workspace\\TestNG\\driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
        
		else if (browserName.equals("ie")) {
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\sam10\\eclipse-workspace\\TestNG\\driver\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			
		}
		
		else {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sam10\\eclipse-workspace\\TestNG\\driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		driver.get("https://www.facebook.com/");
		
	}
	
	
	
	
}
