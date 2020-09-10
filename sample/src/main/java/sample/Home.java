package sample;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Home {

	  WebDriver driver;

	    By From = By.xpath("//input[@class='inputSrch']");
	    By To = By.id("gosuggest_inputDest");
	    By Departure =By.xpath("//span[text()='4996'][1}");
	    By date=By.id("fare_20200913");
	    
	   
	    
	  	   

	    public Home(WebDriver driver){

	        this.driver = driver;

	    }

	
	    public void selectFrom(String fromlocation) throws InterruptedException   
	    {
	    	driver.findElement(From).click();
	    	driver.findElement(From).sendKeys(fromlocation);
	    	Thread.sleep(2000);
	    	driver.findElement(From).sendKeys(Keys.ARROW_DOWN);
	    	driver.findElement(From).sendKeys(Keys.ENTER);
	    	//driver.findElement(From).sendKeys(Keys.TAB);
	    }
	
	    public void selectTo(String Tolocation) throws InterruptedException 
	    {
	    	driver.findElement(To).click();
	    	driver.findElement(To).sendKeys(Tolocation);
	    	Thread.sleep(2000);
	    	driver.findElement(To).sendKeys(Keys.ARROW_DOWN);
	    	driver.findElement(To).sendKeys(Keys.ENTER);
	    	//driver.findElement(To).sendKeys(Keys.TAB);
	    }
	    
	    public void selectDate(String Tolocation) throws InterruptedException	    
	    {
	    	driver.findElement(Departure).click();
	    	Thread.sleep(2000);
	    	driver.findElement(date).click();
	    	
	    	
	    }
	    
	    
}
