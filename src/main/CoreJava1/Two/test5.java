package Two;

import java.math.BigInteger;
import java.util.Arrays;

public class test5 {

private static final  String te= "dfsf";
    public static void main(String[] args) {
        red:for (int i = 0; i <2; i++){
           System.out.println("############循环１："+i);

          for (int j = 0; j<2; j++) {
              System.out.println("***循环2："+j);
              for (int n = 0; n < 9; n++ ) {
                  System.out.println("循环3："+n);
                  if ( n ==3 ) {
                      continue red;
                  }
              }
          }
           System.out.println("***循环２end");
       }
        System.out.println("end");
        BigInteger bigInteger = BigInteger.valueOf(10);
        int[] a = {1,2,3,4,5,6};
        int[] b = Arrays.copyOf(a, a.length);
        a[2] = 999;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }

}
