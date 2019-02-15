package Two.ZeRen;

import Two.Inceptor.Interceptor;

import java.lang.reflect.Method;

public class Interceptor1 implements Interceptor {
    @Override
    public boolean before(Object prpxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器１－项目经理——before");
        return true;
    }

    @Override
    public void around(Object prpxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器１－项目经理——around");
    }

    @Override
    public void after(Object prpxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器１－项目经理——after");
    }
}
