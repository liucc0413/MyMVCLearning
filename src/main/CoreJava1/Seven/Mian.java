package Seven;

import Seven.Test.LoggerTest;

public class Mian {
    public static void main(String[] args) {
       try {
           //new Asserts().test();
           new LoggerTest().test();
       }catch (Exception e) {
           System.out.println("d");
       }
    }
}
