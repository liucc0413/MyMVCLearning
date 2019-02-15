package Seven;

import Seven.Test.LoggerTest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Asserts {
    private static final Logger logger = Logger.getLogger("Test.Asserts");
    public void test () {

       logger.setLevel(Level.WARNING);
       logger.info("123");
       logger.warning("warinng");
       logger.finer("dfasddddddddddddddddddd");
       //logger.log(Level.WARNING, "error ", new RuntimeException("异常测试"));
 /*      RuntimeException runtimeException = new RuntimeException("throwr***************");
       logger.throwing("Test.Asserts", "test()", runtimeException);
       throw runtimeException;*/


    }
}
