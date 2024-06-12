package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Startvisit {
	
	static WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[1]")
	private WebElement startVisit;

	public Startvisit(WebDriver driver2) {
		this.driver = driver2;
	     PageFactory.initElements(driver, this);
	}

	public WebElement getStartVisit() {
		return startVisit;
	}
	
	@FindBy(xpath = "//button[@id='start-visit-with-visittype-confirm']")
	private WebElement confirmVisit;

	public WebElement getConfirmVisit() {
		return confirmVisit;
	}
	
	@FindBy(xpath = "//a[@id='attachments.attachments.visitActions.default']")
	private WebElement attachement;

	public WebElement getAttachement() {
		return attachement;
	}
	
	@FindBy(xpath = "//form[@id='visit-documents-dropzone']")
	private WebElement dropFile;
	
	
	public WebElement getDropFile() {
		return dropFile;
	}

	@FindBy(xpath = "//div[@class='att_upload-element att_caption-element']/textarea")
	private WebElement caption;

	public WebElement getCaption() {
		return caption;
	}
	
	@FindBy(xpath = "//button[@class='confirm ng-binding']")
	private WebElement uploadFile;

	public WebElement getUploadFile() {
		return uploadFile;
	}
	
	@FindBy(xpath = "(//ul[@id='breadcrumbs']/li)[2]/a")
	private WebElement patientDetails;

	public WebElement getPatientDetails() {
		return patientDetails;
	}
	
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[1]")
	private WebElement endVisit;

	public WebElement getEndVisit() {
		return endVisit;
	}
	
	@FindBy(xpath = "(//button[@class='confirm right'])[5]")
	private WebElement confirmEndVisit;

	public WebElement getConfirmEndVisit() {
		return confirmEndVisit;
	}
	
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[1]")
	private WebElement startVisitagain;

	public WebElement getStartVisitagain() {
		return startVisitagain;
	}
	
	@FindBy(xpath = "//button[@id='start-visit-with-visittype-confirm']")
	private WebElement confirmVisitagain;

	public WebElement getConfirmVisitagain() {
		return confirmVisitagain;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
