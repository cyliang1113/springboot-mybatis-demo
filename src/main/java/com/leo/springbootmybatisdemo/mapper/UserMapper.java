package com.leo.springbootmybatisdemo.mapper;

import com.leo.springbootmybatisdemo.entity.User;

import java.util.List;

public interface UserMapper {

	public List<User> selectAll();
}
