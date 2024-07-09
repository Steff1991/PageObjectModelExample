package config_Reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.By;

public class ConfigReader {

	public void configRead() throws IOException {
		FileInputStream inpread = new FileInputStream("src/test/resources/config.properties");
		Properties prop = new Properties();
		prop.load(inpread);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		AppConstant.getinstance().setBrowser(browser);
		AppConstant.getinstance().setUrl(url);
		AppConstant.getinstance().setPassword(password);
		AppConstant.getinstance().setUsername(username);
		
		
	}
}
