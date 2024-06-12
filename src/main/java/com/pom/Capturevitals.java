package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Capturevitals {
	
	static WebDriver driver;
	
	@FindBy(xpath = "//a[@id='referenceapplication.realTime.vitals']")
	private WebElement captureVitals;

	public Capturevitals(WebDriver driver2) {
		this.driver = driver2;
	     PageFactory.initElements(driver, this);
	}

	public WebElement getCaptureVitals() {
		return captureVitals;
	}
	
	@FindBy(id = "w8")
	private WebElement height;

	public WebElement getHeight() {
		return height;
	}
	
	@FindBy(id = "next-button")
	private WebElement next;

	public WebElement getNext() {
		return next;
	}
	
	@FindBy(id = "w10")
	private WebElement weight;

	public WebElement getWeight() {
		return weight;
	}
	
	@FindBy(id = "next-button")
	private WebElement nextButton;
	
	
	
	public WebElement getNextButton() {
		return nextButton;
	}

	@FindBy(xpath = "//a[@id='save-form']")
	private WebElement saveform;

	public WebElement getSaveform() {
		return saveform;
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(xpath = "//div[@class='visit-actions active-visit']/a[1]")
	private WebElement endvisit;

	public WebElement getEndvisit() {
		return endvisit;
	}
	
	@FindBy(xpath = "(//button[@class='confirm right'])[8]")
	private WebElement confrimendvisit;

	public WebElement getConfrimendvisit() {
		return confrimendvisit;
	}
	
	
	
	
	
	
	
	
	

	
	

	
	

}
