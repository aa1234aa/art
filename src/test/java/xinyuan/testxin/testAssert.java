package xinyuan.testxin;

import org.testng.Assert;

public class testAssert {
    public static void main(String[] args) {
        String s="bb";
        Assert.assertNotNull(s,"现在为空");
       Assert.assertEquals("LookPage","a","这两个不一样");
    }
}
