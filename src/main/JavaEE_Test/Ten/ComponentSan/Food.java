package Ten.ComponentSan;

import Dao.Role;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Component;

@Component(value = "food1")
public class Food {
    @Bean(name = "roleBean", initMethod = "myInit", destroyMethod = "myDestroy")
    public Role getRole () {
        return new Role(1,"woshilcc");
    }
}
