package com.demo.service.impl;

import com.demo.dao.UserDAO;
import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/9/20.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO dao;
    //登陆
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User login(User user) {
        return dao.selectUser(user);
    }
    @Transactional
    public void register(User user) {
        dao.insertUser(user);
    }
}
