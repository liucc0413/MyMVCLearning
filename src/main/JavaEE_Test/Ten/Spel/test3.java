package Ten.Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "test3")
public class test3 {
    @Value("#{'Tom'.toLowerCase()}")
    private String name;

    public String getName() {
        return name;
    }
}
