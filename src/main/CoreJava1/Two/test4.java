package Two;

import java.io.UnsupportedEncodingException;

public class test4 {

private static final  String te= "dfsf";
    public static void main(String[] args) {
        String s1 = "ZhouJie";

        String s2 = "Zhou";

        String s3 = "Jie";

        String s4 = "Zhou" + "Jie";

        String s5 = s2 + s3;

        String s5s = s5.intern();

        String s6 = "Zhou" + s3;

        String s6s = s6.intern();



        String s7 = new String("ZhouJie");

        String s7s = s7.intern();



        System.out.println(s1 == s4);//1、true

        System.out.println(s1 == s5);//2、false

        System.out.println(s1 == s5s);//3、true

        System.out.println(s1 == s6);//4、false

        System.out.println(s1 == s6s);//5、true

        System.out.println(s1 == s7);//6、false

        System.out.println(s1 == s7s);//7、true
        System.out.println(s1.substring(0,4));
        System.out.println(s2==s1.substring(0,4));
        System.out.println(String.format("%,.2f",1000000.0/3));


    }


}
