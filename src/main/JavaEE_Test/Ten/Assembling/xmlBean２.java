package Ten.Assembling;

import Dao.Role;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class xmlBean２ {
    private int id;
    private List<Role> list;
    private Set<Role> set;
    private Role[] array;
    private Map<Integer, Role> map;
    private Properties properties;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Role> getList() {
        return list;
    }

    public void setList(List<Role> list) {
        this.list = list;
    }

    public Set<Role> getSet() {
        return set;
    }

    public void setSet(Set<Role> set) {
        this.set = set;
    }

    public Role[] getArray() {
        return array;
    }

    public void setArray(Role[] array) {
        this.array = array;
    }

    public Map<Integer, Role> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Role> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
