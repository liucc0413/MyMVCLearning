package FiveTeen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.UnknownHostException;
import java.util.Scanner;

@Component
public class Test2 {
    @Value("${hibernate.connection.driverClass}")
    private String test;

    public String getTest() throws UnknownHostException,FileNotFoundException {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    public int ceshilcc (int n) {
        int i = 1;
        try{
            i++;
            int j = i/n;

        }catch (Exception e){
            i++;
            return i;
        }finally {
            System.out.println("hello");
        }
       return 100;
    }
}
