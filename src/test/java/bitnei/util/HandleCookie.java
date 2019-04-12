package bitnei.util;

import bitnei.base.DriverBase;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class HandleCookie {
	public DriverBase driver;
	public ProUtil pro;
	public HandleCookie(DriverBase driver){
		this.driver = driver;
		pro = new ProUtil("cookies.properties");
	}
	public void setCookie(){
		String value = pro.getPro("R_SESS");
		Cookie cookie = new Cookie("R_SESS",value,"192.168.1.108","/",null);
		driver.setCookie(cookie);
	}
	/**
	 * 获取cookie
	 * */
	public void writeCookie(){
		Set<Cookie> cookies = driver.getCookie();
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("R_SESS")){
				pro.writePro(cookie.getName(), cookie.getValue());
				System.out.println(cookie.getValue());
			}
		}
	}
}
