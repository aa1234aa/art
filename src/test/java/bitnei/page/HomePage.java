package bitnei.page;

import bitnei.base.DriverBase;
import org.openqa.selenium.WebElement;
import bitnei.testcase.getByLocator;

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
        action(element(getByLocator.getLocator("rolename")));
        return element(getByLocator.getLocator("basicinfo"));
    }
    //获取用户名
    public WebElement getUserNmaeElement(){
        driver.switchToMode();
        return element(getByLocator.getLocator("name"));
    }
}

