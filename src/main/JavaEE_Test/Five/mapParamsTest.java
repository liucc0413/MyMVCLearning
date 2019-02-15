package Five;

import Dao.Role;
import Three.Impl.Pages;
import Three.Impl.RoleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class mapParamsTest {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            InputStream in = Resources.getResourceAsStream("MyBatisTest/myBatis-conf-P.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            sqlSession = factory.openSession();
            RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);

            Map<String, Object> map = new HashMap<>();
            map.put("id", 1);
            map.put("name","lcc");

            /*map注入*/
            Role role = mapper.getRoleByIdAndName(map);
            System.out.println("map注入:" +role.getName());
            /*参数＠param注入*/
            Role role2 = mapper.getRoleByIdAndNameParma(1, "lcc");
            System.out.println("参数注入:" +role2.getName());
            Role pojo = new Role();
            pojo.setId(1);
            pojo.setName("lcc");
            Role role3 = mapper.getRoleByIdAndNameBean(role);
            System.out.println("bean 注入:" +role3.getName());


            /*混合用法*/
            Pages pages = new Pages();
            pages.setStart(0);
            pages.setEnd(1);
            Role mix = mapper.findByMix(role3, pages);
            System.out.println("mix :" + mix.getName() + " " +mix.getId());



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
