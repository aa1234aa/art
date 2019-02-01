package com.mushishi.selenium.business;

import com.mushishi.selenium.base.DriverBase;
import com.mushishi.selenium.handle.loginPageHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPro {
	public loginPageHandle lph;
	public DriverBase driver;
	public LoginPro(DriverBase driver){
		this.driver = driver;
		lph = new loginPageHandle(driver);
	}
	public void login(String username,String password){
		if(lph.assertLoginPage()){
			lph.sendKeysUser(username);
			lph.sendKeysPassword(password);
			driver.findElement(By.className("moco-btn")).click();
			//lph.clickAutoSignin();
			//lph.clickLoginButton();
		}else{
			System.out.println("页面不存在或者状态不正确。");
		}

	}
	
}
