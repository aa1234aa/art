package anan.ceshi.com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
    public WebDriver driverName(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.marionette","D:\\geckodriver.exe");
            return new FirefoxDriver();
        }else{
            System.setProperty("webdriver.chrome.driver","D:\\BaiduNetdiskDownload\\chromedriver.exe");
            return new ChromeDriver();
        }
    }
}
