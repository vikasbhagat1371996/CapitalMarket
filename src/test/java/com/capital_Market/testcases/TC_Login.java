package com.capital_Market.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.capital_Market.pageobjects.Login_page;



public class TC_Login extends BaseClass {
	
	
      

	
		


		@Test(priority=1)
		public void login() throws IOException {
			
			
		System.out.println("vikas");
			
			if(driver.getTitle().equals("Login - Validus Platform"))
			{
				Assert.assertTrue(true);
				
			}
			else
			{
				captureScreen(driver,"LoginTest");
				Assert.assertTrue(false);
			}}
		
		
		@Test(priority=2)
		public void checklogo() {
			Login_page lp=new Login_page(driver);
			lp.checklogo();
		}
		
					
		
		@Test(priority=3)
		public void checklogin( ) {
			Login_page lp=new Login_page(driver);
			lp.setUserName(username);
			lp.setpassword(password);
			lp.clicklogin();
			
		}
		
		
		@Test(priority=5)
		public void checkHeader() {
			Login_page lp=new Login_page(driver);
			String header = lp.CheckHeader();
			System.out.println(header);
		}
		
		@Test(priority=4)
		public void gettitle() {
			driver.getTitle();
		}
		
	
		
		
		
		@Test
		public void checkUserImageTest() {
			Login_page lp=new Login_page(driver);
		try {	
			Boolean b = lp.userimage();
			System.out.println(b);
			Assert.assertTrue(b); 
		}catch(NullPointerException e) {
		}
		
			}
		
		  
}



				
	
	
	
	
	
	
	

