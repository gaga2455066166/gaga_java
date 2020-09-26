package com.cjl.dao;


import com.cjl.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findUserByIdAndUsername(Integer id, String username);

    void add(User user);

    void delete(int id);

    User findUserById(int id);

    void update(User user);

}
