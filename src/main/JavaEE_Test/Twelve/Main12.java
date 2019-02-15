package Twelve;

import Dao.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.StatementCallback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-ceshi-zhuanyong.xml")
public class Main12 {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test() {
        Role role = select(1);
        System.out.println(role.toString());

    }

    @Test
    public void insertTest() {
      /*  insert(new Role(9,"ccl"));
        System.out.println(select(3).toString());
*/
        /*update(new Role(9,"cclGEfsd"), 9);
        System.out.println(select(9).toString());*/
        delete(new Role(9,null));
    }

    public Role select (int id) {
        String sql = "select * from Role where id=" +id;
        final Role role = jdbcTemplate.queryForObject(sql, new RowMapper<Role>() {
            @Override
            public Role mapRow(ResultSet resultSet, int i) throws SQLException {
                Role result = new Role();
                result.setId(resultSet.getInt("id"));
                result.setName(resultSet.getString("name"));

                return result;
            }
        });
        return role;
    }

    public int insert(Role role){
        String sql = "insert into Role values(?,?)";
        return jdbcTemplate.update(sql,role.getId(), role.getName());
    }

    public int delete (Role role) {
        String  sql = "delete from Role where id=? ";
        return jdbcTemplate.update(sql, role.getId());

    }
    public int update (Role role, int id) {
        String sql = "update Role set id=?,name=? where id=" +id;
        return jdbcTemplate.update(sql,role.getId(),role.getName());
    }

    public Role getStatementCallBack() {
        Role role = jdbcTemplate.execute(new StatementCallback<Role>() {
            @Override
            public Role doInStatement(Statement statement) throws SQLException, DataAccessException {
                Role result = null;
                String sql = "select * from Role where id=2";
                ResultSet resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
                    result = new Role(resultSet.getInt("id"), resultSet.getString("String"));
                }
                return result;
            }
        });
        return  role;
    }


}
