package Ten.ComponentSan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "service2")
public class Service２ implements Service {
    @Override
    public void printInfo() {
        System.out.println("I am service2");
    }
}
