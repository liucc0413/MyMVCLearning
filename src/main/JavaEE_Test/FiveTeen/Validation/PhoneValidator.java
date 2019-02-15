package FiveTeen.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator implements ConstraintValidator<Phone,String> {
    private boolean required = false;
    public static final Pattern pattern = Pattern.compile("[0-9]*");
    @Override
    public void initialize(Phone phone) {
        required = phone.required();

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (required) {
            if (s == null) {
                return false;
            }
            Matcher matcher = pattern.matcher(s);
            return matcher.matches();
        } else {
            return true;
        }
    }
}
