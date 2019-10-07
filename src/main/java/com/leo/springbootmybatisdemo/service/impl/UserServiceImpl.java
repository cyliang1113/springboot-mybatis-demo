package com.leo.springbootmybatisdemo.service.impl;

import com.leo.springbootmybatisdemo.entity.User;
import com.leo.springbootmybatisdemo.mapper.UserMapper;
import com.leo.springbootmybatisdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public void abcd() {
        log.info("abcd");
    }
}
