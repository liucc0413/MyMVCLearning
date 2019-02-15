package Ten.ComponentSan;

import Dao.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ComponentMain {

    public static void main(String[] args) {
        /*ApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        test test = (Ten.ComponentSan.test) context.getBean("test");
        ComUser user2 = test.getUser();
        System.out.println(user2.toString());

        UseService useService = (UseService) context.getBean("useService");
        useService.printServiceInfo();
        Food food = (Food) context.getBean("food");
        food.getRole();
        Role role = (Role) context.getBean("roleBean");
        System.out.println(role.toString());*/

        ApplicationContext context1 = new AnnotationConfigApplicationContext(ImportTest.class);
       /* Role r = (Role) context1.getBean("role");
        System.out.println(r.toString());*/


        Food food = (Food) context1.getBean("food1");
        food.getRole();
        Role role = (Role) context1.getBean("roleBean");
        System.out.println(role.toString());



    }
}
