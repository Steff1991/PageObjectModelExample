package config_Reader;

public class AppConstant {
	private String browser;
	private String url;
	private	String username;
	private String password;
	public static AppConstant appConstants;
	private AppConstant() {
		
	}
	public static AppConstant getinstance() {
		if(appConstants==null) {
			appConstants=new AppConstant();
		}	
		return appConstants;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getBrowser() {
		return browser;
	}
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
}



