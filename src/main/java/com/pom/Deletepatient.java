package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deletepatient {
	
	static WebDriver driver;
	
	@FindBy(xpath = "//div[@class='float-sm-right']/span")
	private WebElement patientId;

	public Deletepatient(WebDriver driver2) {
		this.driver = driver2;
	     PageFactory.initElements(driver, this);
	}

	public WebElement getPatientId() {
		return patientId;
	}
	
	@FindBy(xpath = "//li[@class='float-left'][8]")
	private WebElement deletePatient;

	public WebElement getDeletePatient() {
		return deletePatient;
	}
	
	@FindBy(xpath = "//input[@id='delete-reason']")
	private WebElement deleteReason;

	public WebElement getDeleteReason() {
		return deleteReason;
	}
	
	@FindBy(xpath = "(//button[@class='confirm right'])[6]")
	private WebElement confirmDeletePatient;

	public WebElement getConfirmDeletePatient() {
		return confirmDeletePatient;
	}
	
	@FindBy(xpath = "//input[@id='patient-search']")
	private WebElement searchpatientID;

	public WebElement getSearchpatientID() {
		return searchpatientID;
	}
	
	
	
	
	


}
