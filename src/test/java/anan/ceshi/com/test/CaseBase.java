package anan.ceshi.com.test;

public class CaseBase {
    public DriverBase InitDriver(String browser){
        return  new DriverBase(browser);
    }
}
