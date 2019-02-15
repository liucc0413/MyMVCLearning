package FourTeen;

import java.util.concurrent.*;

public class CallableMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        MyCallable callable = new MyCallable();
        Future<Integer> result = service.submit(callable);
        service.shutdown();


     /*   FutureTask<Integer> result = new FutureTask(new MyCallable());
        new Thread(result).start()*/;
        new Thread(()-> {
            try {
                System.out.println("start get");
                int r = result.get();
                //System.out.println(r);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        try {
            Thread.sleep(5000);
            System.out.println("cancle");
            result.cancel(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
