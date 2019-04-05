package bitnei.page;

import bitnei.base.DriverBase;
import bitnei.testcase.getByLocator;
import org.openqa.selenium.WebElement;

/**
 * 基础数据管理
 */
public class BasicPage extends BasePage {
    public BasicPage(DriverBase driver) {
        super(driver);
    }
    public WebElement basicModule(){
       return  element(getByLocator.getLocator("basicModule"));
    }
}
