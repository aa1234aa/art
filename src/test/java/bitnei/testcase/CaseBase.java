package bitnei.testcase;

import bitnei.base.DriverBase;

public class CaseBase {
	public DriverBase InitDriver(String browser){
		return new DriverBase(browser);
	}

}
