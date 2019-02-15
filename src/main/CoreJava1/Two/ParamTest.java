package Two;

public class ParamTest {
    public static void main(String[] args) {
        Student a = new Student(0);
        Student b = new Student(100);

        System.out.println("交换前：");
        System.out.println("a的分数：" + a.getScore() + "--- b的分数：" + b.getScore());

        swap(a, b);

        System.out.println("交换后：");
        System.out.println("a的分数：" + a.getScore() + "--- b的分数：" + b.getScore());
    }

    public static void swap(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
    }
}
