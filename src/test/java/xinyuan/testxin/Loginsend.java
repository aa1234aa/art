package xinyuan.testxin;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Loginsend extends CaseBase{
    public DriverBase driver;
    public LoginPro loginPro;//全局
    static Logger logger=Logger.getLogger(Loginsend.class);
    public Loginsend() {
        this.driver=InitDriver("chrome");
        loginPro=new LoginPro(driver);
    }
    @Test
    public void getLoginHome(){
        driver.get("https://www.imooc.com/");
        driver.findElement(By.id("js-signin-btn")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
  @Test(dependsOnMethods = {"getLoginHome"})
    public void testLogin(){
       loginPro.login("18210544883","anlili123");
    }

}
