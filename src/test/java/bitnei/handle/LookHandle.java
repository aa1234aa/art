package bitnei.handle;

import bitnei.base.DriverBase;
import bitnei.page.HomePage;
import bitnei.page.LookPage;

/**anliping
 * 首页操作层
 */
public class LookHandle {
    public DriverBase driver;
    public LookPage lookpage;

    public LookHandle(DriverBase driver) {
        this.driver = driver;
        lookpage=new LookPage(driver);
    }
    //点击模块首页，获取首页
    public String getHomePage(){
        lookpage.click(lookpage.lookPage());
        String home=lookpage.getText(lookpage.getHome());
        return home;
    }

}
