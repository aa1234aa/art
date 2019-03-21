package bitnei.business;

import bitnei.base.DriverBase;
import bitnei.handle.HomeHandle;

/**
 * anliping
 * 预期业务层
 */
public class HomePro {
    public DriverBase driver;
    public HomeHandle hoh;

    public HomePro(DriverBase driver) {
        this.driver = driver;
        hoh=new HomeHandle(driver);
    }
    //判断用户信息和登录信息是都一致
    public boolean AssertLogin(String username){
        if(hoh.getUserName().equals(username)){
            return true;
        }else{
            return false;
        }
    }
}
