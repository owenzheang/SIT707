package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\145\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get("https://www.twitch.tv/");
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		WebElement button = driver.findElement(By.cssSelector("[data-a-target='login-button']"));
		button.click();

		sleep(2);
		
		WebElement email = driver.findElement(By.id("login-username"));
		System.out.println("Found email: " + email);
		
		email.sendKeys("zheang001@gmail.com");
		sleep(2);
		
		WebElement password = driver.findElement(By.id("password-input"));
		System.out.println("Found password: " + password);
		
		password.sendKeys("1111");
		sleep(2);
		

		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		
		WebElement button2 = driver.findElement(By.cssSelector("[data-a-target='passport-login-button']"));
		button2.click();

		sleep(2);
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
		sleep(3);
		saveScreenshot(driver);
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	public static void saveScreenshot(WebDriver driver) {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File("E:\\selenium_screenshot.png"));
        } catch (IOException e) {
            System.out.println("Failed to save screenshot");
            e.printStackTrace();
        }
    }
	
	
}
