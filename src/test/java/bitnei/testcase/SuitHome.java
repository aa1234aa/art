package bitnei.testcase;

import bitnei.base.DriverBase;
import bitnei.business.LookPro;
import bitnei.page.LookPage;
import bitnei.util.HandleCookie;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 车辆
 */
public class SuitHome extends CaseBase {
    public DriverBase driver;
    public HandleCookie handleCookie;
    public LookPro lookpro;

    @BeforeClass
    public void beforeClass(){
        this.driver=InitDriver("chrome");
        //lookpro=new LookPro(driver);
        handleCookie=new HandleCookie(driver);
        handleCookie.setCookie();
        driver.get("http://192.168.1.108:6060/vehicle");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test
    public void lookInfo(){
           lookpro.assertHome("首页");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }



}
