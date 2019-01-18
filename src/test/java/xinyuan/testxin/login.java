package xinyuan.testxin;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class login {
    public WebDriver driver;
    public void InitDriver(){
        System.setProperty("webdriver.chrome.driver","D:\\BaiduNetdiskDownload\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("js-signin-btn")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //登陆脚本
    public void loginScript(String username,String password) throws Exception{
        this.InitDriver();
        WebElement user=this.element(this.byStr("username"));
        user.isDisplayed();
        WebElement passwo=driver.findElement(By.name("password"));
        passwo.isDisplayed();
        WebElement btnred=driver.findElement(By.xpath(".//*[@id='signup-form']/div[5]/input"));
        btnred.isDisplayed();
        user.sendKeys(username);
        passwo.sendKeys(password);
        btnred.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement header=driver.findElement(By.id("header-avator"));
        header.isDisplayed();
        Actions actions=new Actions(driver);
        actions.moveToElement(header).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String userInfo=this.element(By.className("name")).getText();
        if (userInfo.equals("平安24")) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
        driver.close();
    }
    public WebElement element(By by){
        WebElement ele=driver.findElement(by);
        return ele;
    }
    public By byStr(String username){
        ProUtil proUtil=new ProUtil("xinyuan.properties");
        String locator=proUtil.getPro(username);
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];
        if (locatorType.equals("id")) {
            return By.id(locatorValue);
        } else if (locatorType.equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.equals("className")){
            return By.className(locatorValue);
        }else{
            return By.xpath(locatorValue);
        }
    }


    public static void main(String[] args) throws Exception{
        login login=new login();
        HashMap<String,String> user=new HashMap<String, String>();
        user.put("18210544883","anlili123");
        user.put("aa","bb");
        //如何读取
        Iterator us=user.entrySet().iterator();
        while (us.hasNext()){
            Map.Entry entry=(Map.Entry) us.next();
            String username=entry.getKey().toString();
            String password=entry.getValue().toString();
            login.loginScript(username,password);
        }

    }
}
