package Five;

import Three.Impl.RoleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class RowRoundMainTest {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            InputStream in = Resources.getResourceAsStream("MyBatisTest/myBatis-conf-P.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            sqlSession = factory.openSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RowBounds rowBounds = new RowBounds(1,8);
//            List<Role> roles = roleMapper.findRoleBylimit("wo", rowBounds);
//            System.out.println(roles.get(0).getId());
           /* int test2 = roleMapper.insertGer(new Role(20,"ceshilcc"));
            System.out.println(test2);*/
           roleMapper.getRole(1);

          sqlSession.commit();
     ;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
