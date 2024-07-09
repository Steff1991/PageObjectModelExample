package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testcases.BaseClass;

public class HomePage {
	
	By sortDropDown=By.className("product_sort_container");
    By txtonesie=By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
    	this.driver=driver;

    }
	public void sortHighToLow()
	{
		Select drpselect = new Select(driver.findElement(sortDropDown));
		drpselect.selectByIndex(3);

	}
	public void sortLowToHigh()
	{
		Select drpselect = new Select(driver.findElement(sortDropDown));
		drpselect.selectByIndex(2);

	}
	public void addOnsieToCart()
	{
		WebElement onesie= driver.findElement(txtonesie);
		onesie.click();
	}
	
}
