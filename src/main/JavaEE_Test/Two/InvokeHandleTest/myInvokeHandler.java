package Two.InvokeHandleTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class myInvokeHandler implements InvocationHandler {
    private Object target = null;
    public jdkTest bind(Object object) {
        this.target = object;
        return  (jdkTest) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类实现逻辑");
        Object o = method.invoke(target, args);
        System.out.println("代理逻辑之后");
        return o;
    }
}
