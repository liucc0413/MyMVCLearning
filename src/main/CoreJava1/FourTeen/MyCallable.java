package FourTeen;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i = 0;
        while (i <10){
            i++;
            Thread.sleep(1000);
            System.out.println(i);
        }
        return i;
    }
}
