package com.demo.dao;

import com.demo.entity.User;

/**
 * Created by Administrator on 2016/9/20.
 */
public interface UserDAO {
    /**
     * 添加用户
     * @param user
     */
    public void insertUser(User user);

    /**
     * 查询用户
     * @param user
     * @return
     */
    public User selectUser(User user);
}
