package Two.InvokeHandleTest;

public class Main {
    public static void main(String[] args) {
        jdkTest test = new jdkTestImpl();
        myInvokeHandler invokeHandler = new myInvokeHandler();
        jdkTest proxy = invokeHandler.bind(test);
        proxy.sayHello();
    }
}
