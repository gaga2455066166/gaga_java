package com.cjl.service;

import com.cjl.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 注册用户
     *
     * @param user 用户
     * @return 返回是否成功的boolean
     */
    boolean register(User user);

    boolean active(String code);

    boolean login(User user);

    User findUserBySuser(String suser);

    List<User> findAllUser();

    int modifyUserBySuser(User user);

    int userModifyUserBySuser(User user);
}
