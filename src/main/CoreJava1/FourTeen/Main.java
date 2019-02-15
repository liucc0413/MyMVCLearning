package FourTeen;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.SimpleFormatter;

public class Main {
    static String base = "string";

    public static void main(String[] args) {

/*
        AtomicInteger integer = new AtomicInteger();


       *//* for (int i=0; i < 10; i++) {
            int id = integer.incrementAndGet();
            System.out.println(id);
        }*//*

       wrongsingleton wrongsingleton = new wrongsingleton();
       for (int j = 0; j<100; j++) {
           new Thread(()->wrongsingleton.test()).start();
       }*/

        ThreadLocalTest threadLocalTest = new ThreadLocalTest();
        for (int j = 0; j<10; j++) {
            new Thread(()->threadLocalTest.test1()).start();
        }


    }
}
