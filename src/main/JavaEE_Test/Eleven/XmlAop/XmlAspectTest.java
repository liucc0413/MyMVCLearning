package Eleven.XmlAop;

import Dao.Role;
import org.aspectj.lang.ProceedingJoinPoint;


public class XmlAspectTest{

    public void before (Role role) {

        System.out.println("before " + role.getId());
    }


    public void after() {
        System.out.println("after");
    }


    public void afterReturning() {
        System.out.println("afterReturning");
    }

    public void afterThrowing() {
        System.out.println("afterThrowing");
    }


    public void aroud(ProceedingJoinPoint joinPoint) {
        System.out.println("aroud before");
        try {
            Object[] args = joinPoint.getArgs();
            if (args!=null) {
                args[0]=new Role(99999,"aroud修改");
            }
           Object object =  joinPoint.proceed(args);
            if( object!= null && object instanceof Integer) {
                System.out.println(object);
            }

            System.out.println("around after");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }



}
