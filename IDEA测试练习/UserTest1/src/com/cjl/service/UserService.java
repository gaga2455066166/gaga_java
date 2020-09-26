package com.cjl.service;

import com.cjl.domain.User;

import java.util.List;

/**
 * 用户管理的业务接口
 */
public interface UserService {
    /**
     * 查询所有用户的信息
     *
     * @return
     */
    public List<User> findAll();

    /**
     * 登录的接口
     *
     * @param user
     * @return
     */
    User login(User user);

    void addUser(User user);

    void delUser(String id);

    User findUserById(String id);

    void updateUser(User user);

    void delUsersByids(String[] ids);
}
