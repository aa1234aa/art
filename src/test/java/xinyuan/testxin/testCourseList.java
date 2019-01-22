package xinyuan.testxin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class testCourseList extends CaseBase {
    public DriverBase driver;
    public testCourseList(String browser) {
        this.driver=InitDriver("chrome");
    }
    @Test
    public void CourseList(){
        driver.get("https://coding.imooc.com/");
        List<String> listString=this.listElement();
        for (int i=0;i<listString.size();i++){
            driver.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")).click();
            String courseDetail=driver.findElement(By.className("path")).findElement(By.tagName("span")).getText();
            driver.findElement(By.id("buy-trigger"));
            driver.findElement(By.linkText("提交订单")).click();
            String orderTest=driver.findElement(By.id("num")).getText();
            if(orderTest!=null){
                driver.findElement(By.id("left")).findElement(By.tagName("dt")).getText();
            }
            Assert.assertEquals(courseDetail,orderTest,"购买的商品信息不一样");
        }
    }
    //获取所有的课程
    public List<String> listElement(){
        List<String> listString=new ArrayList<String>();
        WebElement element=driver.findElement(By.className("shizhan-course-list"));
        List<WebElement> listElement=element.findElements(By.className("shizhan-course-box"));
        for(WebElement el:listElement){
            listString.add(el.findElement(By.className("shizan-desc")).getText());
        }
        return listString;
    }
    public void testLogin(){

    }
    public void buyCourse(){
        String courseDetail=driver.findElement(By.className("path")).findElement(By.tagName("span")).getText();
        driver.findElement(By.id("buy-trigger"));
        driver.findElement(By.linkText("提交订单")).click();
        String orderTest=driver.findElement(By.id("num")).getText();
        if(orderTest!=null){
            driver.findElement(By.id("left")).findElement(By.tagName("dt")).getText();
        }
        Assert.assertEquals(courseDetail,orderTest,"购买的商品信息不一样");
    }

  /*  public static void main(String[] args) {
        String country="country";
        getNewName(country,2);
        System.out.println(country);
        List<String> list=new ArrayList<String>();
        list.add("first");
        getListSize(list);
        System.out.println(list.size());

    }

    public static void getNewName(String sourcepara,int i) {
        if (i==1){
            sourcepara="aa";
        }
        if (i==2){
            sourcepara="aa";
        }
        if (i==3){
            sourcepara="aa";
        }

    }
    public static void getListSize(List<String> listpara){
        listpara.add("second");
    }*/
}
