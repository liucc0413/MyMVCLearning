package Four;

import Dao.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

public class PropertyTest {
    public static void main(String[] args) {

        SqlSession sqlSession = null;
        try {
//            InputStream in = Resources.getResourceAsStream("MyBatisTest/myBatis-conf-P.xml");
            InputStream in = Resources.getResourceAsStream("MyBatisTest/myBatis-conf-P.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
            sqlSession = sessionFactory.openSession();
            Role role = sqlSession.selectOne("getRole", 1);
            System.out.println(role.getName());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
