package BA;

import Four.TypeHandler.SexEnum;
import Six.MyComparable;
import Six.MyComparator;
import Six.MyStringSort;
import Two.Student;

import java.sql.SQLOutput;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Set<String> set = new LinkedHashSet<String>(){{add("a"); add("b"); add("c");}};
        String [] arr = set.toArray(new String[set.size()]);
        String s1 = arr[0];
        System.out.println(Arrays.toString(arr));
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>(2, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > 3;
            }
        };
        map.put("1","a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");


        map.get("1");
        System.out.println(Arrays.toString(map.keySet().toArray(new String[3])));
        LinkedHashMap<String, String> map2 = new LinkedHashMap<>(10,0.75f,true);

        for(int i=0; i<10; i++) {
            map2.put("key" + i, i+"");
        }

        Set<String> keySet = map2.keySet();
        keySet.remove("key3");
        Collection<String> vList =  map2.values();
        vList.remove("1");
        String s = map2.get("key2");
        for (Map.Entry<String, String> entry : map2.entrySet()) {

            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

/*        EnumSet<SexEnum> sexEnums = EnumSet.allOf(SexEnum.class);//SexEum里的全部
        EnumSet<SexEnum> sexEnum2 = EnumSet.noneOf(SexEnum.class);//返回空集合，并存储制定枚举类型
        EnumSet<SexEnum> sexEnum3 = EnumSet.of(SexEnum.FEMAN, SexEnum.MAN);//返回一个包含制定枚举常量的集合
        EnumSet<SexEnum> sexEnum4 = EnumSet.range(SexEnum.MAN, SexEnum.TEST2);//返回一个to到from的集合
        System.out.println();

        System.out.println("1".hashCode());
        System.out.println(new String("1").hashCode());

        Map<String, String> identityHashMap = new HashMap<>();
        identityHashMap.put(new String("1"), new String("a"));
        identityHashMap.put("1", new String("a"));
        System.out.println(identityHashMap.size());*/

        List<Integer> yuanshiList  = new ArrayList< Integer>(){{add(0);add(1);add(2);add(3);}};

     /*   List<Integer> subList = yuanshiList.subList(0, 2);
        subList.add(5);
        subList.remove(0);*/


     /*   List<Integer> unmodifyList = Collections.unmodifiableList(yuanshiList);
        List<Integer> subList = yuanshiList.subList(0, 2);
        subList.add(5);
        System.out.println(Arrays.toString(yuanshiList.toArray(new Integer[yuanshiList.size()])));
    */

        List<Integer> yuanList = new ArrayList<>();
        for(int i = 0; i < 30; i++) {
            yuanList.add(i);
        }
     /*   List<Integer> synList = Collections.synchronizedList(yuanList);
        List<Integer> synList2 = Collections.synchronizedList(yuanList);
        new Thread(()->{for (int i = 0; i < synList.size(); i++) {
            synList.set(i,9999);
        }}).start();
        new Thread(()->{for (int i = 0; i < synList2.size(); i++) {
            synList2.set(i, 100000);
        }}).start();*/
      /*  new Thread(()->{for (int i = 0; i < yuanList.size(); i++) {
            yuanList.set(i,9999);
        }}).start();
        new Thread(()->{for (int i = 0; i < yuanList.size(); i++) {
            yuanList.set(i, 100000);
        }}).start();*/

       /* Thread.sleep(5000);*/
 /*       System.out.println(Arrays.toString(yuanList.toArray(new Integer[yuanList.size()])));
        List test = Collections.checkedList(yuanList, Integer.class);
        test.add("a");*/
        List<MyComparable> myComparable = new ArrayList<>();
        myComparable.add(new MyComparable(18));
        myComparable.add(new MyComparable(2));
        myComparable.add(new MyComparable(22));
        myComparable.add(new MyComparable(33));
        myComparable.add(new MyComparable(11));
        Collections.sort(myComparable);
        //myComparable.sort(Comparator.reverseOrder());
        System.out.println(Arrays.toString(myComparable.toArray(new MyComparable[0])));



        List<Student> myStringSorts = new ArrayList<Student>()
        {{add(new Student(2));add(new Student(7));add(new Student(1));add(new Student(4));add(new Student(9));add(new Student(11));}};
        Collections.sort(myStringSorts,new MyComparator());
        System.out.println(Arrays.toString(myStringSorts.toArray(new Student[0])));
        //myStringSorts.sort(new MyComparator().reversed());
        int i = Collections.binarySearch(myComparable,new MyComparable(12));
        System.out.println(i);




    }
}
