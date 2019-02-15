package FourTeen;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadLocalTest {
    public void test1() {

        ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = ThreadLocal.withInitial(()->new SimpleDateFormat("yy-mm-dd HH:mm:ss:SSS") );
        String date = simpleDateFormatThreadLocal.get().format(new Date());
        System.out.println(Thread.currentThread().getName() + ":" +date);
    }
}
