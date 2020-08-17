package com.cjl.dao;


import com.cjl.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
    public User findUserByIdAndUsername(Integer id,String username);

    public void add(User user);

    public void delete(int id);

    public User findUserById(int id);

    public void update(User user);

}
