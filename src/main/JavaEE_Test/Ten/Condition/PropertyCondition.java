package Ten.Condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class PropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment =  conditionContext.getEnvironment();

        return  environment.containsProperty("hibernate.connection.url") && environment.containsProperty("hibernate.connection.username")
                && environment.containsProperty("hibernate.connection.password");
    }
}
