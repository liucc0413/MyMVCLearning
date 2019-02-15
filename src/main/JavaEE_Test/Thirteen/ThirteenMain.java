package Thirteen;

import Dao.Role;
import Twelve.TwelveUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-ceshi-zhuanyong13.xml")
public class ThirteenMain {
    @Autowired
    RoleListService roleListService;
    @Autowired
    TwelveUser twelveUser;
    @Autowired
    RoleService roleService;

    @Test
public void test () {
    List<Role> list = new ArrayList<>();
    for (int i=0; i<6; i++) {
        list.add(new Role(i+24, "13ceshi"));
    }
    int c = roleListService.insertListROle(list);

    System.out.println(c);
}

@Test
public void te () {
    System.out.println(twelveUser.getRole(3));
    /*roleService.test();*/
    twelveUser.deleteById(8);



}

@Test
    public void ceshi () throws InterruptedException {
        roleService.insertRole4(new Role(22,"wo"), 5, 105);
        roleService.insertRole4(new Role(44,"wo"), 0,33);

}


}
