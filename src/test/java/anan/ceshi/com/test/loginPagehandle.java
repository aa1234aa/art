package anan.ceshi.com.test;

public class loginPagehandle {
    public DriverBase driver;
    public loginPage lp;
    public loginPagehandle(DriverBase driver){
        this.driver=driver;
        lp=new loginPage(driver);
    }
    /*输入用户名*/
    public void sendKeysUser(String username){
        lp.sendKeys(lp.getUserElement(),username);
    }
    /*输入密码*/
    public void sendKeysPassword(String password){
        lp.sendKeys(lp.getPasswordElement(),password);
    }
    /*输入验证码*/
    public void sendKeysCheck(String txtVeryCode){
        lp.sendKeys(lp.getcheckElement(),txtVeryCode);
    }
    /*获取登陆按钮*/
    public void clickLoginbutton(){
        lp.click(lp.getLoginbuttonElement());
    }
    /*判断是否是登陆页面*/
    public boolean assertLoginPage(){
        return lp.assertElements(lp.getUserElement());
    }
}
