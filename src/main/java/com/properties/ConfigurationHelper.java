package com.properties;

import java.io.IOException;

public class ConfigurationHelper {
	
	public static ConfigurationReader getInstance() throws IOException {
		ConfigurationReader c = new ConfigurationReader();
		return c;
		
	}
	
	private ConfigurationHelper() {
		
	}


}
