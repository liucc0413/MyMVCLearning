package Two.InvokeHandleTest.CGLCB;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class clgbProx implements MethodInterceptor {

    public Object getProxy(Class classz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(classz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return object;
    }
}
