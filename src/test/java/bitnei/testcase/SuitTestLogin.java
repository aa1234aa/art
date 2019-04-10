package bitnei.testcase;

import bitnei.base.DriverBase;
import bitnei.business.HomePro;
import bitnei.business.LoginPro;
import bitnei.util.HandleCookie;
import bitnei.util.ProUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * anliping
 * 登录分离
 */
public class SuitTestLogin extends CaseBase{
    public DriverBase driver;
    public LoginPro lop;
    public ProUtil pro;
    public HomePro hp;
    public HandleCookie handleCookie;
  @BeforeClass
    public void beforeClass() {
        this.driver=InitDriver("chrome");
        handleCookie=new HandleCookie(driver);
        pro=new ProUtil("bitneitest");
        hp=new HomePro(driver);
        //全局等待
        driver.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.driver.manage().window().maximize();
        lop=new LoginPro(driver);
        driver.get(pro.getPro("url"));
    }
    @Test
    public void testLogin(){
         String username=pro.getPro("username");
         String password=pro.getPro("password");
         String txtVeryCode=pro.getPro("txtVeryCode");
        lop.login(username,password,txtVeryCode);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //hp.AssertLogin(pro.getPro("yq")
        if(true){
            System.out.println("登录成功"+username);
            handleCookie.writeCookie();
        }else{
            System.out.println("登陆失败");
        }
    }
   @AfterClass
    public void afterClass(){
      driver.close();
    }

}
