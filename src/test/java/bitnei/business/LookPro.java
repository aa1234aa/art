package bitnei.business;

import bitnei.base.DriverBase;
import bitnei.handle.LookHandle;

/** anliping
 * 首页业务层
 */
public class LookPro {
    public DriverBase driver;
    public LookHandle lookHandle;

    public LookPro(DriverBase driver) {
        this.driver = driver;
        lookHandle=new LookHandle(driver);
    }
    public boolean assertHome(String yq){
        if(lookHandle.getHomePage().equals(yq)){
            return true;
        }else{
            return false;
        }
    }
}
