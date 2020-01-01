package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface BaseService<T>{
    // 查询所有
    List<T> findAll();

    //根据ID查询
    T findById(Integer id);

    //添加
    Integer insert(T t);

    //删除
    Integer delete(Integer id);

    //修改
    Integer update(T t);
}
