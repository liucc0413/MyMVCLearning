package FiveTeen.Validation;

import Dao.Tran;
import Dao.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("test4")
public class MyController4 {

    @InitBinder
    public void initBinder(DataBinder dataBinder) {
        dataBinder.setValidator(new MyValidator());
    }

    @RequestMapping("m1")
    public void test1(@Valid Tran tran, Errors errors) {
        if (errors.hasErrors()) {
            List<FieldError> list = errors.getFieldErrors();
            for (FieldError error : list) {
                System.out.println("属性:" + error.getField() + "   errorMsg:" + error.getDefaultMessage());
            }
        }
    }
    @RequestMapping("m2")
    public void test1() {

        System.out.println("fdsaaaaaaa");
    }


}
