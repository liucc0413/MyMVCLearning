package FiveTeen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test19")
public class Controller19 {
    @Autowired
   private Test2 test2;
    @Value("${hibernate.connection.driverClass}")
    private String tt;
   @RequestMapping("te")
    public void test1() {
      /*  String d = test2.getTest();
        System.out.println(d);
       System.out.println(tt);*/
    }
}
