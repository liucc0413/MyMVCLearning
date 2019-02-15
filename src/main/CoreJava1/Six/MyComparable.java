package Six;

public class MyComparable implements Comparable<MyComparable> {
    private int age;
    public MyComparable(int age) {this.age = age;}
    @Override
    public int compareTo(MyComparable o) {

        if (this.age > o.age) {
            return 1;
        } else if(this.age < o.age){
            return -1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return ""+age;
    }
}
