package Seven;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class logTest {
    private static final Logger logger = Logger.getLogger("logTest","MessageBundle");

    public static void main(String[] args) {
        Locale locale = new Locale("en","US'");
        logger.log(Level.INFO, "k1","lcc");
    }

}
