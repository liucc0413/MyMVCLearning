package Eleven;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class AspectTest {

    @Pointcut("execution(* Eleven.RoleService.*(..))")
    public void point() {

    }

    @Before("point()")
    public void before () {
        System.out.println("before");
    }
    @Around("point()")
    public void aroud(ProceedingJoinPoint joinPoint) {
        System.out.println("aroud before");
        try {
            joinPoint.proceed();
            System.out.println("around after");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


    @After("point()")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning("point()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    @AfterThrowing("point()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

   /* @Before("execution(* RoleService.print(..))")
    public void before () {
        System.out.println("before");
    }

    @After("execution(* RoleService.print(..))")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning("execution(* RoleService.print(..))")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    @AfterThrowing("execution(* RoleService.print(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }*/




}
