package FiveTeen.Validation;

import Dao.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("test3")
public class MyController3 {

    @RequestMapping("m1")
    public void test1(@Valid  Transaction transaction, Errors errors) {
        if (errors.hasErrors()) {
            List<FieldError> list = errors.getFieldErrors();
            for (FieldError error : list) {
                System.out.println("属性:" + error.getField() + "   errorMsg:" + error.getDefaultMessage());
            }
        }

    }


    @RequestMapping("m2")
    public void test2(Transaction transaction) {
        System.out.println(transaction.toString());
    }

}
