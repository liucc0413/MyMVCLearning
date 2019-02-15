package FourTeen;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.LongAdder;

public class JiHe {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(){{add(1);add(2);}};
        Iterator<Integer> it = list.iterator();
        list.add(3);
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();

        Set<Integer> key = map.keySet();

        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4,4);
        map.put(5,5);
        map.put(6,4);
        map.put(7,7);


      // int searchv=  map.search(7, (k, v)->k==4 ?k : null);
       // System.out.println(searchv);

        //key.forEach((e)-> System.out.println(e));

       /* Set<Integer> set = new HashSet<Integer>(){{add(1);add(2);}};
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<Integer>(){{add(1);add(2);}};
        Iterator<Integer> setIt = list.iterator();
        list.add(3);
        setIt.forEachRemaining((e)-> System.out.println(e))*/;
        //map.forEach(9, (k,v)-> System.out.println(k+" "+v));
        //map.forEach(9, (k,v)-> System.out.println(v == 7 ? k : null));

        //map.forEach(9, (k,v)-> v == 7 ? k : null, System.out::println);
        int m1 = map.reduceValues(9, Integer::sum);
        System.out.println("m1:"+m1);
        int m = map.reduceValues(9,v->v>=5 ? v : null,Integer::sum);
        System.out.println(m);
        Set<String> set = new ConcurrentSkipListSet<>();
        Set<Integer> set1 = ConcurrentHashMap.newKeySet();
        Set<Integer> set2 =  map.keySet(1);
        set2.add(10);
        map.forEach(9, (k,v)-> System.out.println(k+" "+v));




    }
}
