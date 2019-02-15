package Five;

public class Student extends Person {
    private String name;
    private int age;
    public Student(String name, int age) {
        super("student");
        this.name = name;
        this.age = age;
    }
    public void  add (float age) {
        System.out.println("float:"+age);
    }

    public void add (long age) {
        System.out.println("long:" + age);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
