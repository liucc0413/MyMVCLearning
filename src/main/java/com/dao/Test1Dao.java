package com.dao;

import com.entity.Test1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("test1Dao")
public class Test1Dao {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;
    public void update(Test1 user) {
        Session session = null;
        Transaction transaction = null;
      try {  Test1 user1 = new Test1();
          user1.setId(29);
          user1.setName("cds");
          session = sessionFactory.openSession();
          transaction = session.beginTransaction();
          session.save(user1);
          Test1 user2 = (Test1) session.get(Test1.class, 25);

          user2.setName("fsfsrrerdf");
          session.update(user2);
//          session.delete(user2);
          transaction.commit();
      } catch (Exception e) {
            if(transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
      }finally {
          if (session != null && session.isOpen()) {
              session.close();
          }
      }

    }
}
