package Ten.Condition;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;


@Component(value = "test")
@Conditional(value = PropertyCondition.class)
public class Test1 {

    @Value("${hibernate.connection.url}")
    private String url;
    @Value("${hibernate.connection.password}")
    private String password;
    @Value("${hibernate.connection.username}")
    private String userName;

    @Override
    public String toString() {
        return "MyComparable{" +
                "url='" + url + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
