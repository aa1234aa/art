package xinyuan.testxin;

import org.openqa.selenium.By;

public class getByLocator {
    public static By byStr(String username){
        ProUtil proUtil=new ProUtil("xinyuan.properties");
        String locator=proUtil.getPro(username);
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];
        if (locatorType.equals("id")) {
            return By.id(locatorValue);
        } else if (locatorType.equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.equals("className")){
            return By.className(locatorValue);
        }else{
            return By.xpath(locatorValue);
        }
    }
}
