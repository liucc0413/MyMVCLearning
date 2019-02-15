package Two.ZeRen;

import Two.Inceptor.Interceptor;

import java.lang.reflect.Method;

public class Interceptor3 implements Interceptor {
    @Override
    public boolean before(Object prpxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器１－人事经理——before");
        return true;
    }

    @Override
    public void around(Object prpxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器１－人事经理——around");
    }

    @Override
    public void after(Object prpxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器１－人事经理——after");
    }

}
