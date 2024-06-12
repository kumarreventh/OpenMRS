package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
static WebDriver driver;
	
@FindBy(id = "username")
private WebElement Uname;	
	
	
	public Login(WebDriver driver2) {
		this.driver = driver2;
	     PageFactory.initElements(driver, this);
}

	public WebElement getUname() {
	return Uname;
}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id = "Outpatient Clinic")
	private WebElement OutpatientClinic;
	
	public WebElement getOutpatientClinic() {
		return OutpatientClinic;
	}

	@FindBy(xpath = "//input[@id='loginButton']")
	private WebElement logginButton;

	public WebElement getLogginButton() {
		return logginButton;
	}
	
	@FindBy(xpath = "//h4[contains(text(),'Super User')]")
	private WebElement status;

	public WebElement getStatus() {
		return status;
	}


}
