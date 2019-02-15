package Ten.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class tr {
    @Value("${hibernate.connection.url}")
    private String url;

    public String getUrl() {
        return url;
    }

}
