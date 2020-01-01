package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> findById(Long id) {
        return (List<User>) userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void delete(Long... ids) {

    }

    @Override
    public void update(User user) {

    }
}
