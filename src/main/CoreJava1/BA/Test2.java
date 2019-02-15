package BA;

import java.io.Serializable;

public class Test2 {
    public <T> T ceshi1(T c, T a) {
        System.out.println(c.getClass());
        System.out.println(a.getClass());
        return c ; }
    public <T extends Serializable , Number> void ceshi2(T a[]){}
}
