package spring_redis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.data.redis.core.RedisTemplate;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
/** 
 * 基本测试 
 * Created by qqr on 15/4/15. 
 */  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("classpath:/spring-context-jedis.xml")  
public class SpringRedisDemo {  
  
    @Autowired  
    RedisTemplate jedisTemplate;  
  
    @Test  
     public void putAndGet(){  
        jedisTemplate.opsForHash().put("user","name","金三胖");  
        Object name =  jedisTemplate.opsForHash().get("user","name");  
        System.out.println(name);  
        
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("5");
        list.add("3");
        list.add("12");
        
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(5);
        list2.add(3);
        list2.add(12);
        
        jedisTemplate.opsForHash().put("list","num",list2);
        
        List li = (List) jedisTemplate.opsForHash().get("list", "num");
        
        for(int i=0;i<li.size();i++){
        	System.out.println("li:"+li.get(i));
        }
        
        Collections.sort(li);
        for(int i=0;i<li.size();i++){
        	System.out.println("li:"+li.get(i));
        }
        
    }  
    
}  