package FourTeen;

import Two.Student;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

public class RunnableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

   /*     S*//*tudent student = new Student(100);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future f = executorService.submit(new myRunnableTest(student), student);
        executorService.shutdown();
        System.out.println("student score:"+f.get());
*//*

*/
        test2();


    }

    public static void test2 () {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        //executorService.schedule(new myRunnableTest(new Student(1)), 1, TimeUnit.SECONDS);
        Future future = executorService.scheduleAtFixedRate(new myRunnableTest(new Student(1)), 1,1, TimeUnit.SECONDS);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*future.cancel(true);*/

    }
    static class  myRunnableTest implements Runnable {

        static int i = 0;
        Student student = null;
        public myRunnableTest(Student student) {
            this.student = student;
        }
        @Override
        public void run() {
            ++i;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            System.out.println(i +" run start "+simpleDateFormat.format(System.currentTimeMillis()));
            for (int i = 0 ; i <3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i +" run end "+simpleDateFormat.format(System.currentTimeMillis()));
        }
    }

    static class  myRunnableTest2 implements Runnable {

        Integer result = null;
        public myRunnableTest2(Integer result) {
            this.result = result;
        }
        @Override
        public void run() {
           int i = 0;
            while (i < 10) {
                i++;
               int a =  result.intValue();
               result = Integer.valueOf(a+1);
            }
            System.out.println(result.hashCode());
        }
    }
}
