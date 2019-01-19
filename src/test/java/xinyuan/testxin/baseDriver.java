package xinyuan.testxin;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class baseDriver {
    WebDriver driver;
    //driver初始化
    public baseDriver(){
        System.setProperty("webdriver.chrome.driver","D:\\BaiduNetdiskDownload\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    public void takeScreenShot(){
        long data=System.currentTimeMillis();//获取现在的时间戳
        String path=String.valueOf(data);
        String curPath=System.getProperty("user.dir");
        path=path+".png";
        String screenPath=curPath+"/"+path;
        File screen=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//操作句柄
        try {
            FileUtils.copyFile(screen,new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
