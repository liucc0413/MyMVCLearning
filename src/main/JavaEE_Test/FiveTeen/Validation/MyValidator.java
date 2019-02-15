package FiveTeen.Validation;

import Dao.Tran;
import Dao.Transaction;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MyValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(Tran.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Tran tran = (Tran) o;
        Double price = tran.getPrice();
        if (price >10.0) {
            errors.rejectValue("price", null, "价格不可以大于10");
        }
    }
}
