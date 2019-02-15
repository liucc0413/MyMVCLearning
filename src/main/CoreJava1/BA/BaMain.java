package BA;

import Five.Person;
import Four.TypeHandler.SexEnum;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class BaMain {
    public static void main(String ... args) {
  /*      Test1<String> test1 = new Test1<>("lcc","ww");

        System.out.println(test1.ceshi1());

        System.out.println(new Test2().ceshi1(1, 1.0));
       *//* if (test1 instanceof Test1<String>) {}
        Test1<String>[] ceshi = new Test1<String>[10];*//*
        Test1<Double> test2 = new Test1<Double>();
        System.out.println(test1.getClass().equals(test2.getClass()));*/
        try {
         /*   Class clazz = Class.forName(Person.class.getName());
            Person test11 = (Person) clazz.getConstructor(String.class).newInstance("ces");
            System.out.println(""+test11);
            int i = 0;
            new Thread(( )->{
                System.out.println(i);
            }).start();
*/

  /*          List<String> list = new LinkedList<String>(){{add("1");add("2");add("3");}};
            Iterator<String> it = list.iterator();
            ListIterator<String> listIterator = list.listIterator();
            listIterator.next();
            listIterator.add("4");
            listIterator.add("5");

            it.forEachRemaining((e)->{
                System.out.println("linkList:"+e);
            });



            Set<Integer> set = new TreeSet<Integer>(){{add(1);add(2);add(3);add(4);}};
            Iterator<Integer> iterator = set.iterator();
            iterator.forEachRemaining((e)-> System.out.println(e));
*/
            Set<String> set1 = new HashSet<>(10);
            set1.add("a");
            set1.add("b");
            set1.contains("a");
            System.out.println(Arrays.toString(set1.toArray()));
            TreeSet<String> treeSet = new TreeSet<>();
            treeSet.add("edd");
            treeSet.add("ccc");
            System.out.println(Arrays.toString(treeSet.toArray()));

          /*  TreeSet<Person> people = new TreeSet<>();
            people.add(new Person("edd"));
            people.add(new Person("ccc"));
            System.out.println(Arrays.toString(people.toArray()));*/
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "a");
            map.put(2, "b");
            map.putIfAbsent(3,"f");
            System.out.println(map.get(3));
            System.out.println(map.getOrDefault(3,"-1"));
            System.out.println(map.containsKey(1));
            System.out.println(map.containsValue("a"));
            map.forEach((k, v)-> System.out.println(k+":"+v));
           String[] test =  set1.toArray(new String[set1.size()]);
            System.out.println(Arrays.toString(test));




        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
