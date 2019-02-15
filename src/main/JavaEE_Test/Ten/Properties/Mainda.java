package Ten.Properties;


import org.apache.ibatis.io.Resources;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Mainda {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(test.class);
        String propResource = context.getEnvironment().getProperty("hibernate.connection.url");
        System.out.println("*propResoure方式:　"+propResource);
        /*占位符注入*/
        System.out.println("*占位符注入********: " + ((tr)context.getBean("tr")).getUrl());

        /*load file的方式*/
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("persistence-mysql.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            String userName = properties.getProperty("hibernate.connection.username");
            System.out.println("*load file的方式***: " + userName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
