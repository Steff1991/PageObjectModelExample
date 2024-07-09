package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config_Reader.AppConstant;
import config_Reader.ConfigReader;
import pageObjects.LoginPage;

public class BaseClass {

	protected static WebDriver driver;
    private static final Logger logger = LogManager.getLogger(BaseClass.class);

	
//	public BaseClass(WebDriver driver) {
//		driver=this.driver;
//
//	}
@BeforeSuite
public void ConfigRead() throws IOException {
ConfigReader configreader=new ConfigReader();
	configreader.configRead();
	}

	@BeforeMethod
	public void login() {
		if(AppConstant.getinstance().getBrowser().equalsIgnoreCase("Chrome"))
		{
		driver = new ChromeDriver();
        logger.info("ChromeDriver initialized and maximized.");

		}
		 else 	
			{
			if(AppConstant.getinstance().getBrowser().equalsIgnoreCase("firefox"))
			{
				driver= new FirefoxDriver();
		        logger.info("FireFox Driver initialized and maximized.");

			}
			
		}
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login();
        logger.info("saucelab is initialised");

		
		}
		
		  @AfterMethod public void close() { 
			  driver.close();
			  }
		 
		  @AfterSuite public void quit() { 
			  
			 driver.quit();
			 }
		 
}
