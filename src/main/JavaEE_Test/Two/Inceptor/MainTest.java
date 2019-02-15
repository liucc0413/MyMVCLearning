package Two.Inceptor;
import Two.InvokeHandleTest.*;

public class MainTest {
    public static void main(String[] args) {
        jdkTest jdkTest = new jdkTestImpl();
        jdkTest proxy  = (Two.InvokeHandleTest.jdkTest) MyInvocationHandler.bind(jdkTest, MyInterceptor.class.getName());
        proxy.sayHello();

    }
}
