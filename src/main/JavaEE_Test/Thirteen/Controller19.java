package Thirteen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test19")
public class Controller19 {
   private Test2 test2;
   @RequestMapping("te")
    public void test1() {
        String d = test2.getTest();
        System.out.println(d);
    }
}
