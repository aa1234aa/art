package xinyuan.testxin;

public class LoginPageHandle {
    private DriverBase driver;
    private LoginPage lp;//全局变量
    public LoginPageHandle(DriverBase driver) {
        this.driver = driver;
        lp=new LoginPage(driver);//属性赋值给变量
    }
    //输入用户名
    public void sendKeysUsers(String username){
        lp.sendKeys(lp.getUserElement(),username);
    }
    //输入密码
    public void sendKeysPassword(String password){
        lp.sendKeys(lp.getPasswordElement(),password);
    }
    //点击登陆
    public void clickLoginButton(){
        lp.click(lp.getLoginButtonElement());
    }
    //自动登陆
    public void clickAutoSignin(){
        lp.click(lp.getAutoLoginElement());
    }
    //判断是否是登陆页面
    public boolean assertLoginPage(){
        return lp.assertElementIs(lp.getUserElement());
    }

}
