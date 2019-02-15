package Three;


import Dao.Role;
import Three.Impl.RoleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    public static void main(String[] args)  {
        InputStream in = null;
        SqlSession sqlSession = null;
        try {
            in = Resources.getResourceAsStream("myBatis-conf-JeeTst.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            sqlSession = sqlSessionFactory.openSession();
            //Role role = sqlSession.selectOne("Three.Impl.RoleMapper.getRole",1);
//            Role role = sqlSession.selectOne("getRole",1);
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1);

            System.out.println(role.getId() + " " +role.getName());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
