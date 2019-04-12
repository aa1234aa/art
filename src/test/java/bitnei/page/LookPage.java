package bitnei.page;

import bitnei.base.DriverBase;
import org.openqa.selenium.WebElement;
import bitnei.testcase.getByLocator;
/**
 * dfgdfg
 */
public class LookPage extends BasePage{
    public LookPage(DriverBase driver) {
        super(driver);
    }
    //获取模块首页
    public WebElement lookPage(){
      action(element(getByLocator.getLocator("homeOne")));
      return element(getByLocator.getLocator("homePage"));
    }
    //获取大屏首页
    public WebElement getHome(){
        WebElement home=element(getByLocator.getLocator("home"));
        return home;
    }
}

