package Two.InvokeHandleTest.CGLCB;

public class Main {
    public static void main(String[] args) {
        clgbProx proxy = new clgbProx();
        CGLBTest cglbTest = (CGLBTest) proxy.getProxy(CGLBTest.class);
        cglbTest.sayHello();
    }
}
