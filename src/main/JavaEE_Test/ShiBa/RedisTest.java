package ShiBa;

import Dao.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mvc-redis.xml")
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

  @Test
    public void test1 () {
      SessionCallback callback = new SessionCallback() {
          @Override
          public Object execute(RedisOperations redisOperations) throws DataAccessException {
//              redisOperations.watch("key1");
              redisOperations.multi();
              redisOperations.boundValueOps("key1").set("value1");
              redisOperations.boundValueOps("key").set("value13");
              System.out.println("事务执行过程中，命令进入队列,命令没有被执行，key1的value为空　value="+redisOperations.boundValueOps("key1").get());

              List list = redisOperations.exec();

              String value = (String) redisOperations.boundValueOps("key1").get();

              System.out.println("执行后的key1的value:"+value);

              System.out.println(redisOperations.boundValueOps("key").get());
              return value;
          }
      };

      String value = (String) redisTemplate.execute(callback);
      System.out.println(value);

  }

    @Test
    public void test2 () {
        SessionCallback callback = new SessionCallback() {
            @Override
            public Object execute(RedisOperations redisOperations) throws DataAccessException {

                redisOperations.boundValueOps("ke").set("value1");
                redisOperations.boundValueOps("key2").set("value2");

              /*  List list = redisOperations.exec();
                System.out.println(list.toString());*/

                 return null;
            }
        };

        List list = redisTemplate.executePipelined(callback);

        for (Object l:list) {
            System.out.println(l);
        }


    }

    @Test
    public void test3 (){
        String channel = "chat";
        redisTemplate.convertAndSend(channel,"wo shi lcc");
    }

}
