package anan.ceshi.com.test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

public class TestngListenerScreenShot extends TestListenerAdapter {

    public static WebDriver driver;

    @Override
    public void onTestSuccess(ITestResult tr){
        super.onTestSuccess(tr);
        takeScreenShort(tr);
        driver.close();
    }
    @Override
    public void onTestFailure(ITestResult tr){
        super.onTestFailure(tr);
        takeScreenShort(tr);
        driver.close();
    }
    @Override
    public void onTestSkipped(ITestResult tr){
        super.onTestSkipped(tr);

    }
    @Override
    public void onStart(ITestContext testContext){
        super.onStart(testContext);
    }
    @Override
    public void onFinish(ITestContext result){
          super.onFinish(result);

    }

    public void takeScreenShort(ITestResult tr){
        takeScreenShort();
    }

    /*截图*/
    public void takeScreenShort(){
        long data=System.currentTimeMillis();
        String path=String.valueOf(data);
        String curPath=System.getProperty("user.dir");
        path=path+".png";
        String screenPath=curPath+"/"+path;
        File screen=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screen,new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
