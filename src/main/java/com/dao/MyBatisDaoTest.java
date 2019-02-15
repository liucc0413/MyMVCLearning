package com.dao;

import com.entity.User;
import com.impl.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisDaoTest {

    public void test() {
        SqlSession session = null;
        try {
            session = GetSqlSessionFactory().openSession();
            UserMapper roleMapper = session.getMapper(UserMapper.class);
            User user =  roleMapper.getUser(9);
            System.out.println(user.getId() + " " + user.getName());

            user.setName("ccl");
            roleMapper.updateUser(user);
            System.out.println(user.getId() + " " + user.getName());


            User te = new User();
            te.setId(8690);
            te.setName("dfwfwefwqf");
            roleMapper.insertUser(te);

            roleMapper.deleteUser(80);
            session.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
   public SqlSessionFactory GetSqlSessionFactory()
    {
        SqlSessionFactory sqlSessionFactory = null;

        try
        {
            String rs = "spring-MyBatis-conf.xml";
            Reader reader = null;
            reader = Resources.getResourceAsReader(rs);
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return sqlSessionFactory;
        // 注解方式查询时需要注册mapper
       // sqlSessionFactory.getConfiguration().addMapper(.class);
    }
}
