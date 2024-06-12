package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpatient {
	
	static WebDriver driver;
	
	@FindBy(id = "referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
	private WebElement registerPatient;

	public Registerpatient(WebDriver driver2) {
		this.driver = driver2;
	     PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterPatient() {
		return registerPatient;
	}
	
	@FindBy(xpath = "//input[@name='givenName']")
	private WebElement givenName;

	public WebElement getGivenName() {
		return givenName;
	}
	
	@FindBy(xpath = "//input[@name='familyName']")
	private WebElement famname;

	public WebElement getFamname() {
		return famname;
	}
	
	@FindBy(id = "next-button")
	private WebElement nextButton;

	public WebElement getNextButton() {
		return nextButton;
	}
	
	@FindBy(xpath = "//option[@value='M']")
	private WebElement male;

	public WebElement getMale() {
		return male;
	}
	
	@FindBy(id = "birthdateDay-field")
	private WebElement Bday;

	public WebElement getBday() {
		return Bday;
	}
	
	@FindBy(xpath = "//select[@id='birthdateMonth-field']")
	private WebElement selMonth;

	public WebElement getSelMonth() {
		return selMonth;
	}
	
	@FindBy(id = "birthdateYear-field")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}
	
	@FindBy(id = "address1")
	private WebElement add;

	public WebElement getAdd() {
		return add;
	}
	
	@FindBy(id = "cityVillage")
	private WebElement city;

	public WebElement getCity() {
		return city;
	}
	
	@FindBy(id = "stateProvince")
	private WebElement state;

	public WebElement getState() {
		return state;
	}
	
	@FindBy(id = "country")
	private WebElement country;

	public WebElement getCountry() {
		return country;
	}
	
	@FindBy(id = "postalCode")
	private WebElement postalcode;

	public WebElement getPostalcode() {
		return postalcode;
	}
	
	@FindBy(name = "phoneNumber")
	private WebElement phno;

	public WebElement getPhno() {
		return phno;
	}
	
	@FindBy(id = "submit")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
