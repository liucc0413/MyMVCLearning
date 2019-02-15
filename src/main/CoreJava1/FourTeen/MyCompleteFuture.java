package FourTeen;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;


public class MyCompleteFuture {
    @Test
    public void method() throws ExecutionException, InterruptedException {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "f1";
        }).whenComplete((s,t)-> System.out.println(System.currentTimeMillis() + ":" + s));
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "f2";
        }).whenCompleteAsync((s, t)-> System.out.println(System.currentTimeMillis() + ":" + s));

        CompletableFuture<Void> all = CompletableFuture.allOf(f1, f2);

        //阻塞，直到所有任务结束。
        System.out.println(System.currentTimeMillis() + ":阻塞");
        all.join();
        System.out.println(System.currentTimeMillis() + ":阻塞结束");
        // 一个需要耗时2秒，一个需要耗时3秒，只有当最长的耗时3秒的完成后，才会结束
        System.out.println("任务均已完成。");

    }

}
