package Ten.ComponentSan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class test {

    private ComUser user;

    public ComUser getUser() {
        System.out.println(user.hashCode());
        return user;
    }
    @Autowired
    public void setUser(ComUser user) {
        this.user = user;
    }
}
