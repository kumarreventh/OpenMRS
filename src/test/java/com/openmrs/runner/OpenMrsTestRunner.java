package com.openmrs.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.openmrs.base.OpenmrsBase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\openmrs\\feature\\openmrs.feature",
glue ="com.openmrs.stepdefination",
//tags= "@TaggedHooks",
monochrome = true, dryRun =false, publish = true,
plugin= {"pretty","html:Report/Cucumber_Report"})

public class OpenMrsTestRunner extends OpenmrsBase {
	
	
	@BeforeClass
	public static void set_up() {
    	driver = new ChromeDriver();
	}
	@AfterClass
	public static void tear_Down() {
		//quit();
	}

}

	
	


