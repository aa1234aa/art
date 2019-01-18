package anan.ceshi.com.test;

import org.openqa.selenium.WebElement;

public class loginPage extends BasePage{
    public loginPage(DriverBase driver){
        super(driver);
    }
    /*获取用户名输入框*/
    public WebElement getUserElement(){
        return element(getByLocator.getLocator("username"));
    }
    /*获取密码输入框element*/
    public WebElement getPasswordElement(){
        return element(getByLocator.getLocator("password"));
    }
    /*获取验证码输入框element*/
    public WebElement getcheckElement(){
        return element(getByLocator.getLocator("txtVeryCode"));
    }
    /*获取登陆按钮element*/
    public WebElement getLoginbuttonElement(){
        return element(getByLocator.getLocator("loginbutton"));
    }
    /*获取用户名按钮element*/
    public WebElement getUsernameElement(){
        return element(getByLocator.getLocator("user"));
    }
    /*获取角色转换按钮element*/
    public WebElement getUserjobElement(){
        return element(getByLocator.getLocator("userjob"));
    }
}
