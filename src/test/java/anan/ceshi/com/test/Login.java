package anan.ceshi.com.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
@Listeners({TestngListenerScreenShot.class})/*监听器*/
public class Login {
    private WebDriver driver;
    public void InitDriver(){
        System.setProperty("webdriver.chrome.driver","D:\\BaiduNetdiskDownload\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://192.168.1.114:8000/admin/index.html#");
        driver.manage().window().maximize();
        TestngListenerScreenShot.driver = driver;
    }
    public void logScript(String username,String password)throws Exception{
        this.InitDriver();
        this.element(this.bystr("username")).sendKeys(username);
        this.element(this.bystr("password")).sendKeys(password);
        this.element(this.bystr("txtVeryCode")).sendKeys("bitnei");
        this.element(this.bystr("loginbutton")).click();
        Thread.sleep(4000);
        WebElement header=driver.findElement(this.bystr("user"));
        Thread.sleep(7000);
        Actions actions=new Actions(driver);
        actions.moveToElement(header).perform();
        Thread.sleep(7000);
        String changejob=driver.findElement(this.bystr("userjob")).getText();
        System.out.println(changejob);
        if(changejob.equals("角色切换")){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }
    /*封装by*/
    public By bystr(String username){
        ProUtil properties=new ProUtil("anan.properties");
        String locator=properties.getPro(username);
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];
        if(locatorType.equals("id")){
            return By.id(locatorValue);
        }else if (locatorType.equals("name")){
            return  By.name(locatorValue);
        }else if (locatorType.equals("className")){
            return  By.className(locatorValue);
        }else if (locatorType.equals("xpath")){
            return  By.xpath(locatorValue);
        }else {
            return  By.cssSelector(locatorValue);
        }
    }
    /*封装element*/
    public WebElement element(By by){
        WebElement ele=driver.findElement(by);
        return ele;
    }

    @Test
    public void TEST1()throws Exception {
        Login login=new Login();
        /*hash  key-value username--password*/
        HashMap<String,String> user=new HashMap<String, String>();
        user.put("admin","bitnei");
        /*迭代器*/
        Iterator us= user.entrySet().iterator();
        while (us.hasNext()){
            Map.Entry entry=(Map.Entry) us.next();
            String username=entry.getKey().toString();
            String password=entry.getValue().toString();
            login.logScript(username,password);
        }
    }

    @Test
    public void test(){
        int i = 0;
        int e = 0 ;
    }


}
