package testcases;
import pageObjects.*;
import failure_Rerun.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class TestAddOnesieToCart extends BaseClass {
    private static final Logger logger = LogManager.getLogger(TestAddOnesieToCart.class);

	@Test(groups = { "sanity" })
	public void addOnesieToCart() {
		
		HomePage homepage=new HomePage(driver);
		homepage.addOnsieToCart();
        logger.info("onesie is added to the cart");

	}
	 
	
}
