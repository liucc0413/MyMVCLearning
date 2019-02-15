package Ten.ComponentSan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "service1")
public class Service1 implements Service {
    @Override
    public void printInfo() {
        System.out.println("I am service1");
    }
}
