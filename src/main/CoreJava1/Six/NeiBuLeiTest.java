package Six;

public class NeiBuLeiTest {
    private int age;
    private String name;
    public NeiBuLeiTest(int age, String name) {
        this.age = age;
        this.name = name;
    }
    private void test() {
        System.out.println("test");
    }
    public  class innerClass implements Runnable{

        @Override
        public void run() {
            System.out.println(age++);
            test();
        }

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(int i, int j) {
        class InnerTest {
            public void hello() {
                System.out.println(i);
            }
        }
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("");
            }
        });
    }
}
