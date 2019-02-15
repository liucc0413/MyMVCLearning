package Twelve;

import Dao.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:MyBatisTest/spring-ceshi-mybatis12.xml")
public class MybatisMain {
    @Autowired
    private TwelveUser twelveUser;
   /* @Autowired
    private SqlSessionTemplate sqlSessionTemplate;*/
    @Test
    public void test() {
        Role role = twelveUser.getRole(3);
        System.out.println(role.toString());
    }

    /*@Test
    public void testSqlSessionTemplate() {
        Role role = sqlSessionTemplate.selectOne("Twelve.TwelveUser.getRole", 3);
        System.out.println(role.toString());
    }*/
}
