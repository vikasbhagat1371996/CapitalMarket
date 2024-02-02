package com.capital_Market.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.capital_Market.utilities.Readconfig;

public class BaseClass {
	
	Readconfig readconfig=new Readconfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getusername();
    public String password=readconfig.getpassword();
    public static WebDriver driver;
        
    public static  Logger logger;
        
  @Parameters("browser")
   @BeforeClass
   public void setup(String br) {
	  if(br.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
	  ChromeOptions options=new ChromeOptions();         //For removing error purpose add thes e two line code.
	  options.addArguments("--remote-allow-origins=*");
	     
	     driver=new ChromeDriver(options); 
	     


	 /*What is log?:capturing information /activities at the time of program execution.
	  * types of log
	  * 1.info
	  * 2.warn
	  * 3.error
	  * 4.fatal
	  * 
	  * How to generate the logs ? use apache log4j api(Log4j jar)
	  * how it works ?: it reads log 4j configuration from Log4j .properties file
	  * Where to create :create the inside the resource folder.
	  */
	 logger=Logger.getLogger("Banking1");
	 PropertyConfigurator.configure("log4j.properties");
	   
	//	System.setProperty("webdriver.chrome.driver","D:\\sellenium\\chromedriver_win32 (5)\\chromedriver.exe");
    //   driver=new ChromeDriver(); 
   }
	  else if(br.equals("firefox")) {
		  System.setProperty("webdriver.geco.driver",readconfig.getfirefoxpath());
			 driver=new FirefoxDriver();
	  }
	  else if(br.equals("Edge")) {
		  System.setProperty("webdriver.Edge.driver",readconfig.getEdgepath());
			 driver=new EdgeDriver();
	  }
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://platform.validus.sg/#/auth/login");
	  logger.info("URL is open");
	  
   }
    
 /*  @AfterClass
    public void teardown()
    {
    	driver.quit();
    }*/
    
    @Test
    public void test()
    {
    
    System.out.println("Welcome");
   //driver.get("https://demo.guru99.com/v4/");
    }
    public void captureScreen(WebDriver driver,String tname) throws IOException {

  	TakesScreenshot ts=(  TakesScreenshot)driver;
    File source=ts.getScreenshotAs(OutputType.FILE);
    File target=new File(System.getProperty("user.dir")+"/screenshots/"+tname+".png");
    FileUtils.copyFile(source,target);   
    System.out.println("Screenshot taken");
    
}}