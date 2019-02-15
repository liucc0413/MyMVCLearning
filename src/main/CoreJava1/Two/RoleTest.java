package Two;

public class RoleTest {
    private String name = "ccl";
    private int age=88;

     {
        age = 123;
    }
    public RoleTest(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RoleTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
