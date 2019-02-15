package Five;

import Dao.Role;
import Three.Impl.RoleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ContationMainTest {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            InputStream in = Resources.getResourceAsStream("MyBatisTest/myBatis-conf-P.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            sqlSession = factory.openSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            /********if 语句*******/
            List<Role> roleList = roleMapper.findbyIfName("wo");
            System.out.println("if语句result: " + roleList.size());

            /*＊＊＊＊＊＊＊＊forecha语句＊＊＊＊＊＊＊＊＊＊＊＊＊*/
            List<Integer> idList = new ArrayList<>();
            idList.add(3);
            idList.add(4);
            List<Role> foreachList = roleMapper.findRangeId(idList);
           /* for ( Role role : foreachList) {
                System.out.println("foreach id is:" + role.getId() + " name is:" + role.getName());
            }*/

            List<Role> testList = roleMapper.testCeshi("wo");
            for ( Role role : testList) {
                System.out.println("foreach id is:" + role.getId() + " name is:" + role.getName());
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
