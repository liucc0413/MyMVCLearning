package Six;

import java.util.Comparator;
public class MyStringSort implements Comparator<String> {
    private String name ;
    public  MyStringSort(String name ) {this.name = name;}

    @Override
    public int compare(String o1, String o2) {
       return o2.compareTo(o1);
    }

    @Override
    public String toString() {
        return "" + name ;
    }
}
