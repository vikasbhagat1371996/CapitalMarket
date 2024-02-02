package com.capital_Market.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	public Readconfig() {
	
	
	File src=new File("./configurations/config.properties") ;
	try {
	FileInputStream fis=new FileInputStream(src);
	pro=new Properties();
	pro.load(fis);
}catch(Exception e) {
    System.out.println("Exception is " + e.getMessage());
}
	
	}
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
		
	}
	public String getusername() {
		String username=pro.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password=pro.getProperty("password");
		return password;
	}
	public String getchromepath() {
		String chromepath=pro.getProperty("Chromepath");
		return chromepath;
	}
	public String getfirefoxpath() {
		String firefoxpath=pro.getProperty("firefoxpath");
				return firefoxpath;
	}
	
	public String getEdgepath() {
		String Edgepath=pro.getProperty("Edgepath");
				return Edgepath;
	}
	}
