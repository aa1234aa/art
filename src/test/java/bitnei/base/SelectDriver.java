package bitnei.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
	public WebDriver driverName(String browser){
		if(browser.equalsIgnoreCase("fireFox")){
			System.setProperty("webdriver.firefox.marionette", "D:\\java\\geckodriver\\geckodriver-v0.14.0-win64\\geckodriver.exe");
			return new FirefoxDriver();
		}else{
<<<<<<< HEAD
			System.setProperty("webdriver.chrome.driver","D:\\java\\chromedriver_win32\\chromedriver.exe");
=======
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
>>>>>>> 018a851d449cafa8283b2820b68009f7bdbf5ab9
			return new ChromeDriver();
		}
	}
}
