package Ten.ComponentSan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "user")
public class ComUser {
    @Value("1")
    private int id;
    @Value("ceshiUser")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
