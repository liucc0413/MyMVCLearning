package Two.Inceptor;

import java.lang.reflect.Method;

public interface Interceptor {
    public boolean before (Object prpxy, Object target , Method method, Object[] args) ;

    public void around (Object prpxy, Object target , Method method, Object[] args);

    public void after (Object prpxy, Object target , Method method, Object[] args);

}
