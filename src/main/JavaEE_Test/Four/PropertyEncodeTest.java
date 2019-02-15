package Four;

import Dao.Role;
import Utils.Base64Utils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyEncodeTest {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream("MyBatisTest/persistence-mysql-encode.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            String userName = properties.getProperty("hibernate.connection.username");
            String passWord = properties.getProperty("hibernate.connection.password");
            System.out.println(userName +"  "+passWord);
            properties.setProperty("hibernate.connection.username",Base64Utils.decode(userName));
            properties.setProperty("hibernate.connection.password", Base64Utils.decode(passWord));
            //org.springframework.util.Base64Utils.encode()

            InputStream in = Resources.getResourceAsStream("MyBatisTest/myBatis-conf-PF.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in,properties);
            sqlSession = sessionFactory.openSession();
            Role role = sqlSession.selectOne("getRole", 1);
            System.out.println(role.getName() );
            System.out.println(role.getSex());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
