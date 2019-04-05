package bitnei.page;


import bitnei.base.DriverBase;
import bitnei.testcase.getByLocator;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * anliping
 * 登陆页面元素
 */
public class LoginPage extends  BasePage{
    public LoginPage(DriverBase driver) {
        super(driver);
    }


    public WebElement aa(){
        WebElement aa= element(getByLocator.getLocator("sendname"));
        List<WebElement> elements= aa.findElements(getByLocator.getLocator("el-row"));
        System.out.println(elements.size());
        return aa;
    }
    /*获取用户名输入框
    **/
    public WebElement getUserElement(){
        return element(getByLocator.getLocator("username"));
    }
    /*获取密码输入框*/
    public WebElement getPasswordElement(){
        return element(getByLocator.getLocator("password"));
    }
    /*获取验证码*/
    public WebElement getTxtVeryCodeElement(){
        return element(getByLocator.getLocator("txtVeryCode"));
    }
    /*获取登陆按钮*/
    public WebElement getLoginbtnElement(){
        return element(getByLocator.getLocator("loginbtn"));
    }
    /*获取清除按钮*/
    public WebElement getBtnregElement(){
        return element(getByLocator.getLocator("btnreg"));
    }

}
