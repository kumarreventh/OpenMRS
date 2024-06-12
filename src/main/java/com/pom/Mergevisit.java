package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mergevisit {
	
	static WebDriver driver;
	
	@FindBy(xpath = "(//ul[@id='breadcrumbs']/li)[2]/a")
	private WebElement selname;

	public Mergevisit(WebDriver driver2) {
		this.driver = driver2;
	     PageFactory.initElements(driver, this);
	}

	public WebElement getSelname() {
		return selname;
	}
	
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[3]")
	private WebElement mergevisit;

	public WebElement getMergevisit() {
		return mergevisit;
	}
	
	@FindBy(xpath = "//table[@id='active-visits']/tbody/tr[1]/td[1]/input")
	private WebElement selmerge1;

	public WebElement getSelmerge1() {
		return selmerge1;
	}
	
	@FindBy(xpath = "//table[@id='active-visits']/tbody/tr[2]/td[1]/input")
	private WebElement selmerge2;

	public WebElement getSelmerge2() {
		return selmerge2;
	}
	
	@FindBy(id = "mergeVisitsBtn")
	private WebElement mergevisits;

	public WebElement getMergevisits() {
		return mergevisits;
	}
	
	@FindBy(xpath = "//input[@type='button']")
	private WebElement clkreturn;

	public WebElement getClkreturn() {
		return clkreturn;
	}
	
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[2]")
	private WebElement pastvisit;

	public WebElement getPastvisit() {
		return pastvisit;
	}
	
	@FindBy(xpath = "(//div[@class=\"datetimepicker-days\"]/table/tbody/tr[3]/td[3])[1]")
	private WebElement selectdate;

	public WebElement getSelectdate() {
		return selectdate;
	}
	
	@FindBy(xpath = "(//button[@class='cancel'])[7]")
	private WebElement cancelpastvisit;

	public WebElement getCancelpastvisit() {
		return cancelpastvisit;
	}
	
	

	
	
	
	

}
