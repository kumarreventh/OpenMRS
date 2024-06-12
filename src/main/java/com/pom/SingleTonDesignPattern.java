package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPattern {
	
public WebDriver driver;
	
	public SingleTonDesignPattern(WebDriver driver2) {
		this.driver = driver2;
	     PageFactory.initElements(driver, this);
	}

	public Login login() {
		Login lp = new Login(driver);
		return lp;
	}
	
	public Registerpatient regPatient() {
		Registerpatient lp = new Registerpatient(driver);
		return lp;
	}
	
	public Startvisit startvisit() {
		Startvisit sv = new Startvisit(driver);
		return sv;
		
	}
	
	public Capturevitals captrurevitals() {
		Capturevitals cv = new Capturevitals(driver);
		return cv;
		
	}
	
	public Mergevisit mergevisit() {
		Mergevisit mv = new Mergevisit(driver);
		return mv;
		
	}
	
	public Deletepatient deletepatient() {
		Deletepatient dp = new Deletepatient(driver);
		return dp;
		
	}
	


}
