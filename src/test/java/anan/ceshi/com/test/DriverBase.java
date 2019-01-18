package anan.ceshi.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverBase {
    public WebDriver driver;
    public DriverBase(String browser){
        SelectDriver selectDriver=new SelectDriver();
        this.driver=selectDriver.driverName(browser);
    }
    public WebDriver getDriver(){
        return driver;
    }
    /*封装element方法*/
    public WebElement findElement(By by){
        WebElement element =driver.findElement(by);
        return  element;
    }
    public void get(String url){
        driver.get(url);
    }
    public void back(){
        driver.navigate().back();
    }
}
