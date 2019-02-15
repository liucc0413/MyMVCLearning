package Seven.Test;

import java.io.IOException;
import java.util.logging.*;

public class LoggerTest {
    private static final Logger logger = Logger.getLogger("Test.Asserts.loggerTest");
    public void test () {
      /*  logger.setLevel(Level.FINER);
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        *//*Handler handler = null;
        try {
            handler = new FileHandler();
        } catch (IOException e) {
            e.printStackTrace();
        }*//*
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);
        logger.info("LoggerTest-123");
        logger.warning("LoggerTest-warinng");
        logger.fine("finer");
        logger.throwing("LoggerTest.class", "test", new RuntimeException("dfasfd"));*/
        Handler handler = new ConsoleHandler();
        System.out.println(""+handler);
    }
}
