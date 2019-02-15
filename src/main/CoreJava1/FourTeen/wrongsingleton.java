package FourTeen;

import java.util.concurrent.atomic.AtomicInteger;

public class wrongsingleton {
  /*  private static volatile wrongsingleton _instance = null;

    private wrongsingleton() {}

    public synchronized static wrongsingleton getInstance() {

        if (_instance == null) {
            _instance = new wrongsingleton();
        }

        return _instance;
    }*/

    public  void  test () {
        AtomicInteger id = new AtomicInteger();
        int oldValue = id.get();
        id.set(Math.max(id.get(), 10));
        System.out.println(Thread.currentThread().getName()+":"+id);
    }


}
