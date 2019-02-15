package FiveTeen.Validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Max(10)
@Min(1)
@Constraint(validatedBy = {})
public @interface MinMax {
    String message() default "不在1~10的范围";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


}
