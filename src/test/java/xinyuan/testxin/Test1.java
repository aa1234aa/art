package xinyuan.testxin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.*;

@Listeners({ TestngListenerScreenShot.class })
public class Test1 extends baseDriver{
    public String WindowHandle;
    public void InitDriver(){
        System.setProperty("webdriver.chrome.driver","D:\\BaiduNetdiskDownload\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("js-signin-btn")).click();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
     Test1 ts=new Test1();
     ts.InitDriver();
     ts.moseAction();

    }




    public void inputBox(){
        driver.findElement(By.name("email")).sendKeys("18210544883");
        driver.findElement(By.name("password")).sendKeys("anlili123");
        driver.findElement(By.xpath(".//*[@id='signup-form']/div[5]/input")).click();
        try {
           Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.get("https://www.imooc.com/user/setprofile");
        driver.findElement(By.className("pull-right")).click();
        List<WebElement> elements =driver.findElements(By.xpath(".//*[@id='profile']/div[4]/div/label/input"));
        System.out.println(elements.size());
        for(WebElement radio : elements){
            boolean flag=radio.isSelected();
            if (flag==false){
                radio.click();
                break;
            }else
            {
                System.out.println("选中了");
            }
        }


    }
    public void check(){
        WebElement check=driver.findElement(By.id("auto-signin"));
        if(check.isSelected()==true){
            check.click();
        }
    }
    public void upFile(){
        driver.findElement(By.name("email")).sendKeys("18210544883");
        driver.findElement(By.name("password")).sendKeys("anlili123");
        driver.findElement(By.xpath(".//*[@id='signup-form']/div[5]/input")).click();
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.get("https://www.imooc.com/user/setbindsns");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String jsString="document.getElementsByClassName('update-avator')[0].style.bottom='0'";
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript(jsString);
        driver.findElement(By.className("js-avator-link")).click();
        driver.findElement(By.id("upload")).sendKeys("C:\\Users\\Lenovo\\Desktop\\aa.png");
    }
    public void downSelectBox(){
        driver.get("https://www.imooc.com/user/setprofile");
        driver.findElement(By.className("pull-right")).click();
        WebElement formElement=driver.findElement(By.id("profile"));
        WebElement job=formElement.findElement(By.id("job"));
        Select downList=new Select(job);
        //downList.selectByIndex(2);
        //downList.selectByValue("5");
        //downList.selectByVisibleText("Web前端工程师");
        downList.selectByValue("18");
        List<WebElement> List=downList.getAllSelectedOptions();
        for(WebElement option:List){
            System.out.println(option.getText());
        }
        /*System.out.println(downList.getAllSelectedOptions().get(3));//
        System.out.println(downList.getFirstSelectedOption().getText());*/
    }
    public void moseAction(){
        driver.findElement(By.name("email")).sendKeys("18210544883");
        driver.findElement(By.name("password")).sendKeys("anlili123");
        driver.findElement(By.xpath(".//*[@id='signup-form']/div[5]/input")).click();
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        WebElement login=driver.findElement(By.className("menuContent"));
        List<WebElement> item=login.findElements(By.className("item"));
        Actions actions=new Actions(driver);
        actions.moveToElement(item.get(1)).perform();
        WindowHandle=driver.getWindowHandle();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("HTML/CSS")).click();
        Set<String> handles=driver.getWindowHandles();
        for (String s:handles){
            if(s.equals(WindowHandle)){
                continue;
            }
            System.out.println(s);
            driver.switchTo().window(s);
        }
        driver.findElement(By.linkText("入门")).click();


    }
    public void iframe(){
        driver.findElement(By.name("email")).sendKeys("18210544883");
        driver.findElement(By.name("password")).sendKeys("anlili123");
        driver.findElement(By.xpath(".//*[@id='signup-form']/div[5]/input")).click();
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.get("https://www.imooc.com/wiki/create");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement iframeeleent=driver.findElement(By.id("ueditor_0"));
        driver.switchTo().frame(iframeeleent);
        driver.findElement(By.tagName("body")).sendKeys("jdsjdfhsj");
    }

}
