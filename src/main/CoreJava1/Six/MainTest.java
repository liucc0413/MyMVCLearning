package Six;

import Five.Person;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MainTest {
    public static void main(String[] args) {
    /*    MyComparable my1 = new MyComparable(18);
        MyComparable my2 = new MyComparable(17);
        List<MyComparable> mys = new ArrayList<>();
        mys.add(my2);
        mys.add(my1);
        Arrays.sort(mys.toArray());

        String[] as = {"lcddfd", "abc"};
        Arrays.sort(as,(first,second)->first.length()-second.length());
        Arrays.sort(as,String::compareToIgnoreCase);

        System.out.println(Arrays.toString(as));
        Runnable hello = () -> System.out.println("hello Runnable");
        hello.run();

        new Thread(()->System.out.println("Hello world !")).start();

        List<String > list = new ArrayList<String>(){{add("1");add("2");}};
        list.forEach((String s)-> System.out.println("forEach:" + s));
        list.forEach(System.out::println);
        MyStringSort stringSort = new MyStringSort();
        Arrays.sort(as,(o1,o2)->stringSort.compare(o1,o2));
        Arrays.sort(as,stringSort::compare);


        SixPersion[] sixPersions = {new SixPersion(12,"lcc"),new SixPersion(9,"abcdeb"),new SixPersion(189,null)};
     *//*   Arrays.sort(sixPersions,new SixPersion()::compareByname);
        System.out.println(Arrays.toString(sixPersions));

        Arrays.sort(sixPersions,SixPersion::compareByage);
        Supplier<SixPersion> supplier = SixPersion::new;
        SixPersion s = supplier.get();
        SixPersion sfd = supplier.get();
        System.out.println(s.equals(sfd));*//*

       Arrays.sort(sixPersions,Comparator.comparing(SixPersion::getName,Comparator.nullsLast(new MyStringSort())).thenComparingInt(SixPersion::getAge));
      *//*  Arrays.sort(sixPersions,Comparator.comparing(SixPersion::getName, Comparator.nullsFirst(Comparator.naturalOrder())));*//*
        System.out.println(Arrays.toString(sixPersions));
        Comparator te = Comparator.<MyComparable>naturalOrder();
        Arrays.sort(as, te);



*/

    ProxyJieKouImpl proxyjie = new ProxyJieKouImpl();
    proxyJiekou proxyJiekou1 = (Six.proxyJiekou) new MyInvocationHandler().bind(proxyjie);
        proxyJiekou proxyJiekou2 = (Six.proxyJiekou) new MyInvocationHandler().bind(proxyjie);
        System.out.println(proxyJiekou1.equals(proxyJiekou2));


    }

    public static void test(int start, int end) {
        Runnable runnable = ()->{
            System.out.println(start);
        };
        runnable.run();

    }
}
