package Seven;

import Five.Person;


import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class SevenMainTest {
private Person p;
    ExecutorService executor = Executors.newSingleThreadExecutor();
    public int  test () throws IOException  {
       int i = 0;

        System.out.println(""+p);
        System.out.println();
       try {
           i = i+1;
           System.out.println(i);
           return i;
       } finally {
           ++i;
           System.out.println(i);
       }
    }

    public void test2() throws InterruptedException {
        p = new Person("wp");
        Thread a = new Thread(new lcc());
        executor.execute(a);
        Thread.sleep(2000);
        p.setType("gengai");

    }

    public void test3() {
        p.setType("dfs");
    }

    private class lcc implements Runnable{

        @Override
        public void run() {
            System.out.println(""+p);
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
                System.out.println(""+p);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
