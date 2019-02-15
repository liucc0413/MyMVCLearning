package Twelve;

import Dao.Role;
import Three.Impl.Pages;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TwelveUser {
    public Role getRole(int id);
    public Role getRoleByIdAndName(Map<String,Object> params);
    public Role getRoleByIdAndNameParma(@Param("id") int id1, @Param("name") String name2);
    public Role getRoleByIdAndNameBean(Role role);
    public Role findByMix(@Param("params") Role params,@Param("page") Pages page);
    public List<Role> findRoleBylimit(String name, RowBounds rowBounds);
    public int insertGer(Role role);
    public int insertGer(int id,String name);
    public List<Role> orderByName(String name);
    public List<Role> findbyIfName(@Param("name") String name);
    public List<Role> findRangeId(@Param("idList") List<Integer> idList);
    public List<Role> testCeshi(@Param("name") String name);
    public int deleteById(@Param("id") int id);
}
