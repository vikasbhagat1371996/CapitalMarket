package com.capital_Market.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	
	
	
		WebDriver ldriver;
		
		public Login_page(WebDriver rdriver){
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/form/div/div[1]/div/div/input")
	     	@CacheLookup
		    WebElement Email;
		     
		    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/form/div/div[2]/div[1]/div[1]/div/div/input")
		 	@CacheLookup
		 	WebElement password1;
			
			@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/form/button")
			@CacheLookup
			WebElement login;
			
			@FindBy(xpath = "/html/head/link[1]")
			WebElement logo;
			
			@FindBy(xpath="//*[@id=\"app\"]/div/div/div[1]/div[1]/h1")
			WebElement Header;
		
			@FindBy(xpath="/html/head/title")
			WebElement TitleText;
			
			@FindBy(xpath="//*[@id=\"app\"]/div/div/div[1]/div[1]/img")  
			WebElement userimage;
			
			@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[3]/div/div[1]/div[2]/div[1]/div")
			WebElement name;
			
					
			//apply various action method on the Element of Login page
			
			
			public void setUserName(String Username)
			{
				Email.sendKeys(Username);
			}
			public void setpassword(String Password)
			{
				password1.sendKeys(Password);
	        }
	         
		   public void clicklogin()
		   {
			   login.click();
			
		}
		   
		   public void checklogo() {
		   logo.isDisplayed();
	
}
		   
		   public String CheckHeader()
		   {
			   Header.getText();
			   return null;
			
		}
		   
		   public void getTitle() {
			TitleText.getText();
	
}
		   


         public Boolean userimage() {
        	  userimage.isDisplayed();
        	 return null;
	
}
         public void getname(String name1) {
        	name.sendKeys(name1);
         }
		   
	}


