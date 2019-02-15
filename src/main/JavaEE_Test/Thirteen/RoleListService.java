package Thirteen;

import Dao.Role;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class RoleListService {
    @Autowired
    private RoleService roleService;
    Logger logger = Logger.getLogger(RoleListService.class);
    @Transactional(value = "txmanager",propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public int insertListROle (List<Role> list) {
        int count = 0;
       try {
           for (Role role : list) {

               int i = roleService.insertRole(role);
               count = count +i;

           }
       } catch (Exception e) {
           logger.info(e);
       }
        return count;
    }
}
