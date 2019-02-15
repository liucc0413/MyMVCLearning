package Thirteen;

import Dao.Role;
import Twelve.TwelveUser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Component
public class RoleService {
    @Autowired
    private TwelveUser twelveUser;
       public int a = 9;    
    Logger logger = Logger.getLogger(RoleService.class);
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public int insertRole(Role role) {
        int count = 0;
        try {
             count = twelveUser.insertGer(role);
             int n = 2/0;
        } catch (Exception e) {

            System.out.println(e);
            throw new RuntimeException(e);
        }
       return count;
    }

    private void doSomeThingForFile() {
    }

    @Transactional(value = "txmanager",propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public void test () {
        int o = 0;
         try {
             o = 10;
             a = 10;
             twelveUser.insertGer(new Role(153,"fsd"));
              int i = 2/0;
         } catch (Exception e) {

             throw new RuntimeException("fdsfdsaa");

         }finally {
             

         }


    }

    @Transactional(value = "txmanager",propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
    public int insertRole4(Role role,int n, int id) throws InterruptedException {
        int count = 0;

             role.setId(id/n);
            count = twelveUser.insertGer(role);
            Thread.sleep(n+1);

        return count;
    }


    @Transactional(value = "txmanager",propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
    public Role getRoleById(int id) {
       return twelveUser.getRole(id);
    }

}
