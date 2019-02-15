package Ten.ComponentSan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UseService {
    @Autowired
    @Qualifier("service1")
    Service service;
    public void printServiceInfo() {
        service.printInfo();
    }
}
