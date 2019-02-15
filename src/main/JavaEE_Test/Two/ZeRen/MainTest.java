package Two.ZeRen;

import Two.Inceptor.Interceptor;
import  Two.InvokeHandleTest.*;

public class MainTest {
    public static void main(String[] args) {
        jdkTest jdkTest = new jdkTestImpl();
        jdkTest proxy1 = (Two.InvokeHandleTest.jdkTest) MyInvocationHandler.bind(jdkTest, Interceptor1.class.getName());
        jdkTest proxy2 = (Two.InvokeHandleTest.jdkTest) MyInvocationHandler.bind(proxy1, Interceptor2.class.getName());
        jdkTest proxy3 = (Two.InvokeHandleTest.jdkTest) MyInvocationHandler.bind(proxy2, Interceptor3.class.getName());


        proxy3.sayHello();
    }
}
