package Two;


import java.util.ArrayList;
import java.util.List;

public class Inc {
    public static void main(String[] args) {
        Inc inc = new Inc();
        int i = 0;
        inc.fermin(i);
        i= ++i;
        System.out.println(i);

        List list = new ArrayList();
        list.add(0);
        System.out.println(list.get(0) instanceof Integer);
        char a =0x41;
        char aaa= 'A';
        char adfd= '\u0041';
        System.out.println(a);
        System.out.println('A');
        System.out.println(a=='\u0041');
        System.out.println(adfd);



    }
    void fermin(int i){
        i++;
    }
}