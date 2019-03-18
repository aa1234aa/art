package bitnei.handle;

import bitnei.base.DriverBase;
import bitnei.page.LoginPage;

/**
 * anliping
 * 登陆操作层
 */
public class LoginHandle {
     public DriverBase driver;
     public LoginPage lp;

    public LoginHandle(DriverBase driver) {
        this.driver=driver;
        lp=new LoginPage(driver);
    }
    /*输入用户名*/
    public void sendKeysUser(String username){
        lp.sendkeys(lp.getUserElement(),username);
    }
    /*输入密码*/
    public void sendKeysPass(String password){
        lp.sendkeys(lp.getPasswordElement(),password);
    }
    /*输入验证码*/
    public void sendTxtVeryCode(String txtVeryCode){
        lp.sendkeys(lp.getTxtVeryCodeElement(),txtVeryCode);
    }
    /*点击登陆*/
    public void clickLoginbtn(){
        lp.click(lp.getLoginbtnElement());
    }
    /*点击清除按钮*/
    public void clickBtnreg(){
        lp.click(lp.getBtnregElement());
    }
    /*判断是否显示*/
    public boolean  assertLoginPage(){
        return lp.assertElementIs(lp.getUserElement());
    }
}
