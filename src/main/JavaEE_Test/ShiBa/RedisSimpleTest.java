package ShiBa;

import Dao.Role;
import org.apache.commons.httpclient.Header;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
public class RedisSimpleTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test2() {
        Role role = new Role();
        role.setId(99);
        role.setName("dsafd");
        redisTemplate.opsForValue().set("role_1", role);
        Role role1 = (Role) redisTemplate.opsForValue().get("role_1");
        System.out.println(role1.toString());
        System.out.println(role.hashCode());
        System.out.println(role1.hashCode());
    }

   @Test
    public  void main2() {
        JedisPoolConfig config = new JedisPoolConfig();
        /*配置连接池最大空闲数*/
        config.setMaxIdle(50);

        /*配置连接池最大连接数*/
        config.setMaxTotal(100);

        /*最大等待毫秒数*/
        config.setMaxWaitMillis(20000);

        /*使用配置创建连接池*/
        JedisPool jedisPool = new JedisPool(config, "localhost");

        /*从连接池中获取单个链接*/
        Jedis jedis = jedisPool.getResource();

    }

    @Test
    public void test3() {
        //redisTemplate.opsForValue().set("key1","value1");
        redisTemplate.getConnectionFactory().getConnection().set(redisTemplate.getKeySerializer().serialize("key1"),"val4".getBytes());

        System.out.println("修改前" + redisTemplate.opsForValue().get("key1"));

        redisTemplate.opsForValue().getAndSet("key1","v");
        System.out.println("修改后" + redisTemplate.opsForValue().get("key1"));

        Long size = redisTemplate.opsForValue().size("key1");
        System.out.println("size:"+size);

        Integer append = redisTemplate.opsForValue().append("key1","abc");
        System.out.println("append　后："+redisTemplate.opsForValue().get("key1"));

        System.out.println("截取0-1:"+redisTemplate.opsForValue().get("key1",0,1));

        redisTemplate.delete("key1");
        System.out.println("删除后："+redisTemplate.opsForValue().get("key1"));


    }
    @Test
    public void test4() {


        redisTemplate.opsForValue().set("key1","1");
        System.out.println("修改前" + redisTemplate.opsForValue().get("key1"));

        redisTemplate.opsForValue().increment("key1",1);
        System.out.println("增加１：" + redisTemplate.opsForValue().get("key1"));

        redisTemplate.opsForValue().increment("key1",9);
        System.out.println("增加9：" + redisTemplate.opsForValue().get("key1"));

        redisTemplate.getConnectionFactory().getConnection().decr(redisTemplate.getKeySerializer().serialize("key1"));
        System.out.println("减掉１：" + redisTemplate.opsForValue().get("key1"));

        redisTemplate.getConnectionFactory().getConnection().decrBy(redisTemplate.getKeySerializer().serialize("key1"),3);
        System.out.println("减掉３：" + redisTemplate.opsForValue().get("key1"));

        redisTemplate.opsForValue().increment("key1",1.2);
        System.out.println("增加float-1.2：" + redisTemplate.opsForValue().get("key1"));

        Jedis jedis = (Jedis) redisTemplate.getConnectionFactory().getConnection().getNativeConnection();
        jedis.incrByFloat("key1",0.9);
        System.out.println("获取原始redis连接：" + redisTemplate.opsForValue().get("key1"));
    }

    @Test
    public void hashRedisTest() {
        Map map = new HashMap();
        map.put("id","1");
        map.put("name","lcc");
        redisTemplate.opsForHash().putAll("key1",map);
        redisTemplate.opsForHash().put("key1","age","24");
        redisTemplate.opsForHash().putIfAbsent("key1","phone", "1326116");

        boolean exist = redisTemplate.opsForHash().hasKey("key1", "age");
        System.out.println("age key isExist:"+exist);

        redisTemplate.opsForHash().increment("key1", "id",1);
        printHash("id 加１","key1", "id");

        redisTemplate.opsForHash().increment("key1", "id",1.2);
        printHash("id 加１.2","key1", "id");

        Set keys = redisTemplate.opsForHash().keys("key1");
        System.out.println("keys："+keys.toString());

        List values = redisTemplate.opsForHash().values("key1");
        System.out.println("values："+values.toString());


        Map entryes = redisTemplate.opsForHash().entries("key1");


    }

    public void printHash(String pre, String name, String key) {
        String value = (String) redisTemplate.opsForHash().get(name,key);
        System.out.println(pre + " " +"values:"+value);
    }


    @Test
    public void setTest() {
        redisTemplate.delete("diff");
        redisTemplate.delete("inter");
        redisTemplate.delete("union");
        redisTemplate.delete("set1");
        redisTemplate.delete("set2");


        String set1 = "set1";
        String set2 = "set2";
        redisTemplate.boundSetOps(set1).add(1,2,3,4);
        redisTemplate.boundSetOps(set2).add(3,11,12,13);

        Long size = redisTemplate.opsForSet().size(set1);
        System.out.println("个数：" + size);

        boolean isM = redisTemplate.opsForSet().isMember(set1, 2);
        System.out.println("是否是set1中的值"+isM);

        System.out.println("set1值："+redisTemplate.opsForSet().members(set1));
        System.out.println("set2值："+redisTemplate.opsForSet().members(set2));

        System.out.println("set1和set2的差："+redisTemplate.opsForSet().difference(set1, set2));
        System.out.println("set2和set1的差："+redisTemplate.opsForSet().difference(set2, set1));

        System.out.println("set1和set2的交集："+redisTemplate.opsForSet().intersect(set1, set2));

        System.out.println("set1和set2的并："+redisTemplate.opsForSet().union(set1,set2));

        redisTemplate.opsForSet().differenceAndStore( set1, set2, "diff");
        System.out.println("diff set:"+redisTemplate.opsForSet().members("diff"));

        redisTemplate.opsForSet().intersectAndStore(set1, set2, "inter");
        System.out.println("inter set:"+redisTemplate.opsForSet().members("inter"));

        redisTemplate.opsForSet().unionAndStore(set1, set2, "union");
        System.out.println("union set:"+redisTemplate.opsForSet().members("union"));

        System.out.println("pop:"+redisTemplate.opsForSet().pop(set1));

        System.out.println("rand 2:"+redisTemplate.opsForSet().randomMembers(set1,2));

        System.out.println("remove 11:"+redisTemplate.opsForSet().remove(set1,11));

    }
}
