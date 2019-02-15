package Ten.Condition;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;;

public class ConditionMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PropertyScan.class);
        Test1 test1 = (Test1) context.getBean("test");
        System.out.println(test1.toString());
    }
}
