package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public Properties p ;
	public ConfigurationReader() throws IOException {
		  File f = new File ("C:\\Users\\Lenovo\\eclipse-workspace\\openMRS\\src\\main\\java\\com\\properties\\openMRS");
		  FileInputStream fi = new FileInputStream(f);
		  p = new Properties();
		  p.load(fi);
	  }
	  public String getBrowser() {
		  String Browser = p.getProperty("browser");
		return Browser;
	
	  }
	  public String getUrl() {
		  String Url = p.getProperty("url");
		return Url;
	  }
	  
	  public String getUserName() {
		  String Username = p.getProperty("username");
		return Username;
	  }
	  
	  public String getPassword() {
		  String Password = p.getProperty("password");
		return Password;
	  }
	  
	  public String getGivenName() {
		  String GivenName = p.getProperty("givenName");
		return GivenName;
	  }

	  public String getFamName() {
		  String Famname = p.getProperty("familyName");
		return Famname;
	  }
	  
	  public String getBday() {
		  String Date = p.getProperty("date");
		return Date;
	  }
	  
	  public String getYear() {
		  String Year = p.getProperty("year");
		return Year;
	  }
	  
	  public String getAdd() {
		  String Address = p.getProperty("address");
		return Address;
	  }
	  
	  public String getCity() {
		  String City = p.getProperty("city");
		return City;
	  }
	  
	  public String getState() {
		  String State = p.getProperty("state");
		return State;
	  }
	  
	  public String getCountry() {
		  String Country = p.getProperty("country");
		return Country;
	  }
	  
	  public String getPostalcode() {
		  String Pincode = p.getProperty("pincode");
		return Pincode;
	  }
	  
	  public String getPhno() {
		  String PhoneNumber = p.getProperty("phoneNumber");
		return PhoneNumber;
	  }
	  
	  public String getHeight() {
		  String Height = p.getProperty("height");
		return Height;
	  }
	  
	  public String getWeight() {
		  String Weight = p.getProperty("weight");
		return Weight;
	  }
	  
	  
      	  
	  public String getCaption() {
		  String Caption = p.getProperty("caption");
		return Caption;
	  }
	  
	  public String getDeleteReason() {
		  String DeleteReason = p.getProperty("deleteReason");
		return DeleteReason;
	  }


}
