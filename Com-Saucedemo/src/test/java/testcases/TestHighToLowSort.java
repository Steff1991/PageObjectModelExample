package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import failure_Rerun.RetryListener;
import pageObjects.*;

public class TestHighToLowSort extends BaseClass {
    private static final Logger logger = LogManager.getLogger(TestHighToLowSort.class);

@Test (groups = { "sanity" })
	public void testHighToLow() {
		
	HomePage homepage=new HomePage(driver);
		homepage.sortHighToLow();
        logger.info("High to low sort is done");

		
	}
	
}
