package Ten.Spel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class test2 {

    @Value("#{role}")
    private SpelRole role;
    @Value("#{role.id}")
    private int id;
    @Value("#{role.name}")
    private String name;
    @Value("#{role.sex}")
    private String sex;

    @Override
    public String toString() {
        return "test2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
