package Eleven.DeclareParents;

import Eleven.RoleService;
import Dao.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VerifyMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfigVerify.class);
        RoleService roleService = (RoleService) context.getBean("roleService");
        RoleVerifier roleVerifier = (RoleVerifier) roleService;

       RoleVerifier roleVerifier2 = (RoleVerifier) context.getBean("roleVerifier");
       roleVerifier2.verify(null);

        Role role = new Role(32,"woshimeinv");
        if (!roleVerifier.verify(role)) {
           roleService.print(role);
        }

    }
}
