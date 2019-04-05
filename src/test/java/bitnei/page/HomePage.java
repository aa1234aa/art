package bitnei.page;

import bitnei.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import bitnei.testcase.getByLocator;

import java.util.List;

/**
 * anliping
 * 预期判断
 */
public class HomePage extends BasePage{
    public HomePage(DriverBase driver) {
        super(driver);
    }
    //获取基本资料信息element
    public WebElement getInfoElement(){
        //鼠标移动
        action(element(getByLocator.getLocator("rolename")));
        return element(getByLocator.getLocator("basicinfo"));
    }
    //获取用户名
    public WebElement getUserNmaeElement(){
        WebElement username=element(getByLocator.getLocator("name"));
        return username;
    }
}

