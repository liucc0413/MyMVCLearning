package Two.Inceptor;




import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor {
    public boolean before (Object prpxy, Object target , Method method, Object[] args) {
        System.out.println("反射方法前逻辑............");
        return false;
    }

    public void around (Object prpxy, Object target , Method method, Object[] args) {
        System.out.println("取代代理对象的方法 ...............");
    }

    public void after (Object prpxy, Object target , Method method, Object[] args) {
        System.out.println("反射方法后逻辑...............");
    }

}
