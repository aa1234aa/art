package bitnei.business;

import bitnei.base.DriverBase;
import bitnei.handle.LoginHandle;
import org.openqa.selenium.WebDriver;


/**
 * 安莉萍
 * 登陆业务层
 */
public class LoginPro {
    public LoginHandle lh;
    public DriverBase driver;
    public LoginPro(DriverBase driver) {
        this.driver=driver;
        lh=new LoginHandle(driver);
    }
    public void login(String username,String password,String txtVeryCode ){
            if(lh.assertLoginPage()){
                lh.sendKeysUser(username);
                lh.sendKeysPass(password);
                lh.sendTxtVeryCode(txtVeryCode);
                lh.clickLoginbtn();
            }else{
                System.out.println("页面元素不存在");
            }
    }
}
