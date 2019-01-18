package anan.ceshi.com.test;

public class loginPro {
    public loginPagehandle lph;
    public loginPro(DriverBase driver){
        lph=new loginPagehandle(driver);
    }
    public void login(String username,String password,String txtVeryCode){
        if(lph.assertLoginPage()){
            lph.sendKeysUser(username);
            lph.sendKeysPassword(password);
            lph.sendKeysCheck(txtVeryCode);
            lph.clickLoginbutton();
        }else{
            System.out.println("页面不存在或者状态不正确");
        }

    }
}
