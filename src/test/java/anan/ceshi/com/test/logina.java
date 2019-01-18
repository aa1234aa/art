package anan.ceshi.com.test;

import org.testng.annotations.Test;

public class logina extends CaseBase{
    public DriverBase driver;
    public loginPro loginPro;
    public logina(){
        this.driver=InitDriver("chrome");
        loginPro=new loginPro(driver);
    }
    @Test
    public void getLoginHome(){
        driver.get("http://192.168.1.114:8000/admin/index.html#");
    }
    @Test(dependsOnMethods = {"getLoginHome"})
    public void testLogin(){
        loginPro.login("admin","bitnei","bitnei");
    }
}
