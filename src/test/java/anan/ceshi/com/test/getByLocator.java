package anan.ceshi.com.test;

import org.openqa.selenium.By;

public class getByLocator {
    public static By getLocator(String key){
        ProUtil properties=new ProUtil("anan.properties");
        String locator=properties.getPro(key);
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];
        if(locatorType.equals("id")){
            return By.id(locatorValue);
        }else if (locatorType.equals("name")){
            return  By.name(locatorValue);
        }else if (locatorType.equals("className")){
            return  By.className(locatorValue);
        }else if (locatorType.equals("xpath")){
            return  By.xpath(locatorValue);
        }else {
            return  By.cssSelector(locatorValue);
        }
    }
}
