package com.capital_Market.testcases;

import org.testng.annotations.Test;

import com.capital_Market.pageobjects.Login_page;
import com.capital_Market.pageobjects.logout_page;

import junit.framework.Assert;

public class TC_logoutpage extends BaseClass{
	
	
	@Test(priority=1)
	public void checklogin( ) {
		Login_page lp=new Login_page(driver);
		lp.setUserName(username);
		lp.setpassword(password);
		lp.clicklogin();
		
	}
	    @Test(priority=2)
		public void checklogout() {
		String actualtitle=driver.getTitle();
		String expectedtitle="Login - Validus Platform";
		Assert.assertEquals(actualtitle, expectedtitle);			
		
	}
	    
	        @Test(priority=3)
	   	    public void checkimg() {
	    	logout_page lp=new logout_page(driver);
	    	lp.getuserimg();
	    }
	@Test(priority=4)
	public void logout() {
		logout_page lp=new logout_page(driver);
		lp.getlogout();
	}
}
