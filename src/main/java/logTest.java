import org.apache.log4j.Logger;
import org.junit.Test;

public class logTest {
    static Logger logger=Logger.getLogger(logTest.class);
    @Test
    public void mytest(){
        logger.debug("这个是我们第一次使用log4j打印日志");
        logger.error("sssss");
        logger.info("fsdfsdfs");
        logger.info("fsdfsdfs11111");
    }
}
