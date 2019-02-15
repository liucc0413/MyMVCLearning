package Eleven;

import Dao.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AspectMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        RoleService roleService = (RoleService) context.getBean("roleService");

        Role role = new Role(1,"dfaasd");
        roleService.print(role);


       /* role = null;
        roleService.print(role);*/
    }
}
