package anan.styudy.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
    public WebDriver driver;
    @Test
    public void aatDriver(){
        System.setProperty("webdriver.chrome.driver","D:\\BaiduNetdiskDownload\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
    }
    @Test
    public void aa(){
        System.out.println("ss");
    }
}
