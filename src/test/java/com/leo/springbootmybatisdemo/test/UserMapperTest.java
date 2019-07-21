package com.leo.springbootmybatisdemo.test;

import com.leo.springbootmybatisdemo.SpringbootMybatisDemoApp;
import com.leo.springbootmybatisdemo.entity.User;
import com.leo.springbootmybatisdemo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes={SpringbootMybatisDemoApp.class})
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1(){
        List<User> users = userMapper.selectAll();
        log.info(users.toString());
    }
}
