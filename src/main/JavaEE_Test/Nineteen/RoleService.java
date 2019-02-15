package Nineteen;

import Dao.Role;

public interface RoleService {
    public void delete(int id);
    public Role getRole(int id);
    public Role update(Role role);
    public Role insert(Role role);
}
