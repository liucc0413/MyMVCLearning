package Eleven.XmlAop;

import Eleven.RoleService;
import Dao.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-ceshi-zhuanyong.xml")
public class XmlAopMain {
    @Autowired
    private  Role role;
    @Autowired
    private  RoleService roleService;

    @Test
    public void test() {
       /* RoleVerifier roleVerifier = (RoleVerifier) roleService;
        if (!roleVerifier.verify(role)) {
            roleService.print(role);
        }*/
       roleService.test(new Role(1,"lcc"));

    }
}
