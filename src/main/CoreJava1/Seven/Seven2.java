package Seven;

import Five.Person;
import FiveTeen.Test2;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import java.io.FileNotFoundException;
import java.net.UnknownHostException;
@RunWith(JUnit4ClassRunner.class)
public class Seven2  {
    String s="123";
    Person person = new Person("t");

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Test
    public  void main() {
       try {
           //new Seven2().test(0);
           new Seven2().getPerson().setType("tew");
           new test123().run();
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }


    public void test(int n)  {
      try {
            new Test2().getTest();
           int j = 2/n;
      }catch (Exception e){
          System.out.println(e.getMessage());
          throw new RuntimeException("ceshi");
      }finally {
          System.out.println("ddf");
          throw  new RuntimeException("finally");
      }
    }
    private class test123 implements Runnable{

        @Override
        public void run() {
            System.out.println(s);
            System.out.println(person.getType());
            System.out.println(person.hashCode());
        }
    }
}
