package Two.ZeRen;

import Two.Inceptor.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    public String interceptorClass;
    public Object target;

    public MyInvocationHandler (Object target, String interceptorClass) {
        this.interceptorClass = interceptorClass;
        this.target = target;
    }
    public static Object bind (Object target, String interceptorClass) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new MyInvocationHandler(target, interceptorClass));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ( interceptorClass == null) {
            return  method.invoke(target, args);
        }

        Object result = null;
        Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();
        if (!interceptor.before(proxy, target, method, args)) {
            interceptor.around(proxy, target, method, args);
        } else {
            result = method.invoke(target, args);
        }
        interceptor.after(proxy, target, method, args);
        return result;
    }
}
