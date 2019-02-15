package Ten;

import Dao.Role;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TenMain {
    public static void main(String[] args) {
        try {
            Class classz = Class.forName("Dao.Role");
            try {
                Role role = (Role) classz.newInstance();
                Method method = classz.getMethod("setName", String.class);
                role.setId(9);
                method.invoke(role,"dfadas");
                System.out.println(role.getId() +" "+role.getName());

                Constructor constructor = classz.getConstructor(Integer.class, String.class);
                Role role2 = (Role) constructor.newInstance(9999, "woshilcc");
                System.out.println( role2.getId() +" "+role2.getName());
                byte[] df = "1.2".getBytes("utf-8");
                System.out.println(df);
                byte[] t = {49,46,50};
                System.out.println("编码后："+new String(t));

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
