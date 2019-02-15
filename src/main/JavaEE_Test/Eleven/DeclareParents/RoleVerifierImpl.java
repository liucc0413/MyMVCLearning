package Eleven.DeclareParents;

import Dao.Role;
import org.springframework.stereotype.Component;

@Component("roleVerifier")
public class RoleVerifierImpl implements RoleVerifier {

    @Override
    public boolean verify(Role role) {
        System.out.println("验证中************");
        return role == null;
    }
}
