package com.hust.dao;

import com.hust.beans.User;

/**
 * @author 宁鑫
 * @date 2019/6/28
 * @time 16:21
 **/
public interface UserDao {
    void createUser(User user);
    int existsUser(User user);
    void updateUser(User user);
}
