package bitnei.testcase;

import bitnei.base.DriverBase;
import bitnei.business.LoginPro;
import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * 登录
 */
public class login extends CaseBase {
    public DriverBase driver;
    public LoginPro lop;
    @BeforeClass
    public void loginTest(){
        this.driver=InitDriver("chrome");
        driver.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.driver.manage().window().maximize();
        lop=new LoginPro(driver);
    }
    @Test
    public void loginHome(){
       driver.get("http://192.168.1.108:6060/login");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods ={"loginHome"})
    @Parameters({"username","password","txtVeryCode"})
    public void bitneiLogin(String username,String password,String txtVeryCode){
        lop.login(username,password,txtVeryCode);
        driver.get("http://192.168.1.114:8000/evsmc_monitor_service/monitorBord/new");
    }

}
