package FiveTeen.Validation;

import org.omg.SendingContext.RunTime;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PhoneValidator.class)
public @interface Phone {
    boolean required() default true;
    String message() default "电话号码错误";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
