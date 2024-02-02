package com.capital_Market.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout_page {
	
	WebDriver ldriver;
	public logout_page(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
			}
	
	  @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[3]/div/div[1]/div[2]/div[1]/div")
	  WebElement name;
	  
	  @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div/img")
	  WebElement userimg;
	  
	  @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[3]/div/div[1]/div[2]/div[2]/di")
	  WebElement lastname;
	  
	  @FindBy(xpath="//button[text()='Logout']")
	  WebElement logout;
	  
	  
	  
	  
	  public void getname(String name1) {
		  name.sendKeys(name1);
	  }
	  
	  public Boolean getuserimg() {
		  userimg.isDisplayed();
		  return null;		  
	  }
	  
	  public void getlastname(String lastname1) {
		  lastname.sendKeys(lastname1);
	  }
	  
	  public void getlogout() {
		  logout.click();
	  }


}
