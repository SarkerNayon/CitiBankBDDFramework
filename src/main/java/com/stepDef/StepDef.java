package com.stepDef;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	WebDriver driver;
	
	@Given("open chrome and start application")
	public void open_chrome_and_start_application() {
		String path="/Users/nsarker/eclipse-workspace/CityBankFrameWork/src/main/resources/browsers/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
	    driver=new ChromeDriver();
	    driver.get("https://www.citi.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);    
	}
	@When("user provided invalid {string} and {string}")
	public void user_provided_invalid_username_and_password(String user,String pass) {
	 WebElement userN=driver.findElement(By.xpath("//input[@id='username']"));
	 userN.sendKeys(user);
	WebElement passW=driver.findElement(By.xpath("//input[@id='password']"));
	passW.sendKeys(pass);
//	WebDriverWait wait=new WebDriverWait(driver, 20);
//    WebElement userN=wait.until(
//	ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userId-text-input-field']")));
//    userN.sendKeys("johncena@");
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].value='Macbook' ", userN);
	} 

	@Then("user shouldn not able to login")
	public void user_shouldn_not_able_to_login() {
//	 System.out.println("Get URL: "+driver.getCurrentUrl());
//	 System.out.println("Get Title: "+driver.getTitle());
	  driver.quit();
	}

}
