package Eleven;

import Dao.Role;
import org.springframework.stereotype.Component;

@Component(value = "roleService")
public class RoleServiceImpl implements RoleService {
    @Override
    public void print(Role role) {
        System.out.println(role.toString());
    }

    @Override
    public Integer test(Role role) {
        System.out.println("答复 " + role.toString());
        return 20;
    }
}
