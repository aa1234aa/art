package xinyuan.testxin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage(DriverBase driver) {
        super(driver);
    }
    //获取用户名输入
    public WebElement getUserElement(){
        return element(getByLocator.byStr("username"));//静态的通过方法名可以调用
    }
    //获取密码输入框element
    public WebElement getPasswordElement(){
        return element(getByLocator.byStr("password"));
    }
    //获取登陆按钮输入框element
    public WebElement getLoginButtonElement(){
        return element(getByLocator.byStr("btnred"));
    }
    //获取自动登陆按钮输入框element
    public WebElement getAutoLoginElement(){
        return element(getByLocator.byStr("autologin"));
    }
}
