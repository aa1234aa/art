package xinyuan.testxin;

public class LoginPro {
    public LoginPageHandle lph;
    public LoginPro(DriverBase driver) {
        lph=new LoginPageHandle(driver);
    }
    public void login(String username,String password){
        if (lph.assertLoginPage()) {
            lph.sendKeysUsers(username);
            lph.sendKeysPassword(password);
            lph.clickAutoSignin();
            lph.clickLoginButton();
        } else {
            System.out.println("页面不存在或者状态不正确");
        }


    }
}
