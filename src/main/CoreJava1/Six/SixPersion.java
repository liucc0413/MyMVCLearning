package Six;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class SixPersion  {
    private static int index = 0;
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public SixPersion(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public SixPersion() {
        System.out.println("index:"+ index++ + " "+ new Date());
    }

    public static int compareByage(SixPersion a, SixPersion b) {
        return a.age-b.age;
    }

    public int compareByname (SixPersion a, SixPersion b) {
        return a.name.compareTo(b.name);
    }

    @Override
    public String toString() {
        return "SixPersion{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void testConstructor(SixPersion[] sixPersions) {
        System.out.println(Arrays.toString(sixPersions));
    }
}
