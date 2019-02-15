package Ten.Spel;

import com.sun.org.apache.xalan.internal.extensions.ExpressionContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Scan.class)
public class SpelMain {
    @Autowired
    test2 test2;
    @Autowired
    test3 test3;

    @Test
    public void test () {
        System.out.println(test2.toString());
        System.out.println(test3.getName());
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Scan.class);
        test2 test2 = (Ten.Spel.test2) context.getBean("test2");
        System.out.println(test2.toString());
    }

    @Test
    public void parseTest() {
        ExpressionParser parser = new SpelExpressionParser();

        System.out.println(parser.parseExpression("'hello'").getValue(String.class));
        System.out.println(parser.parseExpression("99999").getValue(Integer.class));
        System.out.println(parser.parseExpression("true").getValue(boolean.class));
        System.out.println(parser.parseExpression("null").getValue()  );

    }

    @Test
    public void bianliang(){
        String name = "ccl si go";
        EvaluationContext context = new StandardEvaluationContext();
        context.setVariable("myName", name);
        ExpressionParser parser = new SpelExpressionParser();
        System.out.println(parser.parseExpression("#myName").getValue(context, String.class));
    }
}
