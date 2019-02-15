package Two;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test３ {

private static final  String te= "dfsf";
    public static void main(String[] args) {
        /*String base = "string";
        List list = new ArrayList();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String str = base + base;
            base = str;
            list.add(str);
        }*/
        String a = "afdaca";
        String b = "aa";
        String c= b+"a";
        char aaaaa= 'a';
        System.out.println(a.offsetByCodePoints(0,1));
        System.out.println(a==b);
        System.out.println(a.charAt(0));
        System.out.println(a.codePointCount(0,a.length()));
        int [] id = {97,98,99,100};
        String dafd = new String(id, 0,2);
        System.out.println(dafd);
        System.out.println(a.lastIndexOf("a",2));
        System.out.println(a.replace("a", "ef"));
        System.out.println(" dfd dfdsafdas    dfs   ".trim());
        System.out.println("aaa"==c);
        StringBuilder sb = new StringBuilder("abcdefg");
        sb.setCharAt(0,'z');
        System.out.println(sb);
        System.out.println(sb.insert(1,"/////"));
        /*Scanner in = new Scanner(System.in);
        System.out.println(in.hasNext());*/
        try {
            int utf16 = "我".getBytes("utf-16").length;
            int utf8 = "我".getBytes("utf-8").length;
            int gbk = "我".getBytes("GBK").length;


            char adfd= '\u0041';

            System.out.println("中文-GBK:"+gbk);
            System.out.println("中文-utf8:" + utf8);
            System.out.println("中文-utf16:"+utf16);
            System.out.println("l".getBytes("ISO-8859-1").length);
            System.out.println('\u03C0');
            int d = 0b10;
            int ds = 0b11;
            System.out.println(d^ds);


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


}
