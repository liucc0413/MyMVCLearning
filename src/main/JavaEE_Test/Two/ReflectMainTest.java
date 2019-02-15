package Two;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMainTest {
    public static void main(String[] args) {
        try {
            ReflectImpl target = (ReflectImpl) Class.forName("Two.ReflectImpl").getConstructor(String.class).newInstance("有参数的狗做器");
            Method m = target.getClass().getMethod("sallHello");
            m.invoke(target);

            ReflectImpl reflect = (ReflectImpl) Class.forName("Two.ReflectImpl").newInstance();
            Method method = reflect.getClass().getMethod("sallHello", String.class);
            method.invoke(reflect, "cuicuiliu 没有参数的构造器");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
