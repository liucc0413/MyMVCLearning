package Utils;

import org.springframework.security.crypto.codec.Base64;

import java.io.UnsupportedEncodingException;

public class Base64Utils {

    public static void main(String[] args) {
       String encodeStr = encode("root");
       encode("123456");
       decode(encodeStr);
    }

    public static String encode(String str) {
        byte[] bytes = Base64.encode(str.getBytes());
        String newKey = null;
        try {
            newKey = new String(bytes, "utf-8");
            System.out.println("newKey:" + newKey);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return  newKey;
    }

    public static  String decode (String key) {
        byte[] bytes = Base64.decode(key.getBytes());
        String decodeStr = null;
        try {
            decodeStr = new String(bytes, "utf-8");
            System.out.println("decodeStr:" + decodeStr);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return decodeStr;
    }
}
