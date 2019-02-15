package SixTeen;

import Dao.Role;
import org.springframework.core.convert.converter.Converter;

public class StringToRole implements Converter<String,Role> {
    @Override
    public Role convert(String s) {
        if (s.isEmpty()) {
            return null;
        }else if (!s.contains("-")) {
            return null;
        }else {
           String[] sa = s.split("-");
           Role role = new Role();
           role.setId(Integer.valueOf(sa[0]));
           role.setName(sa[1]);
           return role;
        }
    }
}
