package com.cjl.dao;

import com.cjl.domain.User;

import java.util.List;

public interface UserDao {
    List<User> selectUsers();
}
