package com.demo.service;

import com.demo.entity.User;

/**
 * Created by Administrator on 2016/9/20.
 */

public interface UserService {
    /**
     * 登陆
     * @return
     */
    public User login(User user);

    /**
     * 注册
     */
    public void register(User user);
}
