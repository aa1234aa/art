package anan.ceshi.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class testCourseList extends CaseBase {
    public DriverBase driver;
    public testCourseList(){
        this.driver=InitDriver("firefox");
    }
    @Test
    public void CourseList(){
        driver.get("https://coding.imooc.com/");
        WebElement element=driver.findElement(By.className("shizhan-course-list clearfix"));
        List<WebElement> listElement=element.findElements(By.className("shizhan-course-box"));
        for(WebElement el:listElement){
            el.click();
            driver.back();
        }
    }
}
