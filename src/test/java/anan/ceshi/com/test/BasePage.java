package anan.ceshi.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    public DriverBase driver;
    public BasePage(DriverBase driver){
        this.driver=driver;
    }
    /*定位element*/
    public WebElement element(By by){
         WebElement element=driver.findElement(by);
         return element;
    }
    //封装点击
    public void click(WebElement element){
        if (element !=null){
            element.click();
        }else {
            System.out.println("元素没有定位到，点击失败");
        }
    }
    /*封装输入*/
    public void sendKeys(WebElement element,String value){
        if (element !=null){
            element.sendKeys(value);
        }else {
            System.out.println("元素没有定位到，输入失败");
        }
    }
    /*判断元素是否显示*/
    public boolean assertElements(WebElement element){
        return element.isDisplayed();
    }
}
