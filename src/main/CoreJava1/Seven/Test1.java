package Seven;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        try {
            int i = new SevenMainTest().test();
            System.out.println("main:"+i);
            new SevenMainTest().test2();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
