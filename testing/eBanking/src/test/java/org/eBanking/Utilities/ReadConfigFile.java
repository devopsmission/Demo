package org.eBanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile {
	
    Properties prop;
    public ReadConfigFile()
	{
		
		try {			
			FileInputStream input=new FileInputStream("./Configuration/config.properties");	
			prop=new Properties();
			prop.load(input);
			} catch (Exception e) {			
				e.printStackTrace();
			}
	}
	
	
	public String getUserName()
	{
		String userName=prop.getProperty("userName");
		return userName;
	}
	
	
	public String getPassword()
	{
		return prop.getProperty("password");
	}
	
	public String getUrl()
	{
		return prop.getProperty("url");
	}
	
	public String getChromePath()
	{
		return prop.getProperty("chromepath");
	}
	
	public String getIePath()
	{
		return prop.getProperty("iepath");
	}
	
	public String getFirefoxPath()
	{
		return prop.getProperty("firefoxpath");
	}
	

}
