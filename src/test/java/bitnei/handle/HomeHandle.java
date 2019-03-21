package bitnei.handle;

import bitnei.base.DriverBase;
import bitnei.page.HomePage;

/**
 * anliping
 * 校验期望值处理层
 */
public class HomeHandle {
    public DriverBase driver;
    public HomePage hp;

    public HomeHandle(DriverBase driver) {
        this.driver = driver;
        hp=new HomePage(driver);
    }
    //点击基本资料
    public String getUserName(){
        hp.click(hp.getInfoElement());
        String username=hp.getText(hp.getUserNmaeElement());
        return username;
    }

}
