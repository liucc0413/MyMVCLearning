package Eleven.XmlAop;

import org.aspectj.lang.ProceedingJoinPoint;


public class XmlAspectTest2 {

    public void before () {

        System.out.println("XmlAspectTest2 before ");
    }


    public void after() {
        System.out.println("XmlAspectTest2 after");
    }


    public void afterReturning() {
        System.out.println("XmlAspectTest2 afterReturning");
    }

    public void afterThrowing() {
        System.out.println("XmlAspectTest2 afterThrowing");
    }

    public void aroud(ProceedingJoinPoint joinPoint) {
        System.out.println("XmlAspectTest2 aroud before");
        try {
            joinPoint.proceed();
            System.out.println("XmlAspectTest2 around after");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }









}
