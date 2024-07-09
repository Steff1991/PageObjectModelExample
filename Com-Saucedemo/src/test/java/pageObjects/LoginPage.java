package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config_Reader.AppConstant;
import testcases.BaseClass;

public class LoginPage {

	By txtUserName=By.id("user-name");
	By txtPassWord=By.id("password");
	By btnLogin=By.id("login-button");
    private WebDriver driver;
    
    public LoginPage(WebDriver driver) {
    	this.driver=driver;
    }
	public void login() {
		driver.get(AppConstant.getinstance().getUrl());
		WebElement username = driver.findElement(txtUserName);
        username.sendKeys(AppConstant.getinstance().getUsername());
		WebElement password = driver.findElement(txtPassWord);
		password.sendKeys(AppConstant.getinstance().getPassword());
		WebElement button = driver.findElement(btnLogin);
		button.click();
	}
}
