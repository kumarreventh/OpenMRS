package com.openmrs.base;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenmrsBase {
	
public static WebDriver driver;
	
	public static void Input(WebElement element,String value) {
     element.sendKeys(value);
	}
	
	public static String clickElment(WebElement element) {
	     element.click();
		return null;
		
		}
	public static void clear(WebElement element) {
	     element.clear();
		}
	
	
	public static void launch(String url) {
      driver.get(url);
      driver.manage().window().maximize();
	}
	
	public static void quit() {
	      driver.quit();}
	
	public static void Dropdown(WebElement element,String method,String value) {
      Select s = new Select(element);
      if (method.equalsIgnoreCase("text")) {
    	 s.selectByVisibleText(value);
	}
      else if (method.equalsIgnoreCase("value")) {
    	  s.selectByValue(value);
	}
      else if (method.contentEquals("index")) {
    	  int int1 = Integer.parseInt(value);
    	  s.selectByIndex(int1);
		
	}
	}
	
	public static  void action(WebElement element) {
		Actions action= new Actions(driver);
		action.click(element).build().perform();
	}
	
	public static void javaScript(WebElement element) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
	      js.executeScript("arguments[0].scrollIntoView",element);
	      Thread.sleep(4000);
	      js.executeScript ("arguments[0].click()", element);
		
	}
	
	public static void implicit(int time) {
         driver.manage().timeouts().implicitlyWait(time,TimeUnit.MILLISECONDS);
		
	}
	
	public static void verify(WebElement element,String Expected) {
		String Status = element.getText();
		assertEquals(Expected, Status);
	}
	
	public static void verifyDisplayed(WebElement element) {
		boolean Status = element.isDisplayed();
		assertTrue(Status);
	}
	
	public static String getText(WebElement element) {
    return element.getText();
	}


	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrn = ts.getScreenshotAs(OutputType.FILE);
		File loc = new File("C:\\Users\\Lenovo\\eclipse-workspace\\openMRS\\ScreenShot"+imgName+".png");
		FileUtils.copyFile(scrn, loc);
	}

	
	

}
