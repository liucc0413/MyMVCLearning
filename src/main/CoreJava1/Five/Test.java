package Five;



import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {

        try {

            FiveCeshi fiveCeshi = new FiveCeshi();

            Class cla =fiveCeshi.getClass();
            Field[] df = cla.getFields();
            Field ad = cla.getDeclaredField("test");
            //ad.setAccessible(true);
            Object ade = ad.get(cla);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void test (int ... ints) {
        System.out.println("size:" + ints.length);
        for(int i : ints) {
            System.out.println(i);
        }
    }
}
