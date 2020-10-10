package com.cjl.service;

import com.cjl.domain.PageBean;
import com.cjl.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */
public interface UserService {
    /**
     * 查询所有用户的信息
     *
     * @return List<User>
     */
    List<User> findAll();

    /**
     * 登录的接口
     *
     * @return User
     */
    User login(User user);

    void addUser(User user);

    void delUser(String id);

    User findUserById(String id);

    void updateUser(User user);

    void delUsersByids(String[] ids);

    /**
     * 分页查询
     * @return PageBean<User>
     */
    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
