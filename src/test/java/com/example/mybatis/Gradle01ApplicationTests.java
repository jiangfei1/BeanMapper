package com.example.mybatis;

import com.example.mybatis.binding.MapperProxyFactory;
import com.example.mybatis.dao.IUserDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Gradle01ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testMapperProxyFactory(){
        MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
        Map<String,String> sqlSession = new HashMap<>();
        sqlSession.put("com.example.mybatis.dao.IUserDao.queryUserName", "模拟执行mapper.xml中sql语句操作：查询用户姓名");
        sqlSession.put("com.example.mybatis.dao.IUserDao.queryUserAge", "模拟执行mapper.xml中sql语句操作：查询用户年龄");
        IUserDao userDao = factory.newInstance(sqlSession);
        String result = userDao.queryUserName("10001");
        System.out.println(result);
    }

}
