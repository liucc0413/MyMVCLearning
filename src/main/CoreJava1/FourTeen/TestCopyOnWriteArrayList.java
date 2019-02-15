package FourTeen;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCopyOnWriteArrayList {
    private void test() {
        //1、初始化CopyOnWriteArrayList
        List<Integer> copyList =new ArrayList<Integer>(){{add(1); add(2);}};
        //CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<>(tempList);


        //2、模拟多线程对list进行读和写
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new ReadThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new ReadThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new ReadThread(copyList));
        executorService.execute(new WriteThread(copyList));


        System.out.println("copyList size:"+copyList.size());
        executorService.shutdown();
    }


    public static void main(String[] args) {
        new TestCopyOnWriteArrayList().test();
    }

    class ReadThread implements Runnable {
        private List<Integer> list;

        public ReadThread(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            for (Integer ele : list) {
                System.out.println("ReadThread:"+ele);
            }
        }
    }

    class WriteThread implements Runnable {
        private List<Integer> list;

        public WriteThread(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            this.list.add(9);
        }
    }

}
