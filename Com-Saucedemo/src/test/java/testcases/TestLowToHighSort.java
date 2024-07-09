package testcases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import failure_Rerun.RetryListener;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.*;

public class TestLowToHighSort extends BaseClass {
    private static final Logger logger = LogManager.getLogger(TestLowToHighSort.class);
	@Test (groups = { "sanity" })
	public void testToCart() {
		HomePage homepage=new HomePage(driver);
		homepage.sortLowToHigh();
        logger.info("Low to High sort is done");

	}

}
