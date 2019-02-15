package Ten.Profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ceshi-profile.xml","classpath:spring-ceshi-profile2.xml"})
@ActiveProfiles("dev")
public class Databases {
    @Autowired
    @Qualifier("dataSource")
    private  DriverManagerDataSource dataSource = null;

    @Test
    public void test() {
        try {

            System.out.println( dataSource.getUrl());
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            String sql = "select * from Role where id=1";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println(id + " " + name);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
    }

}
