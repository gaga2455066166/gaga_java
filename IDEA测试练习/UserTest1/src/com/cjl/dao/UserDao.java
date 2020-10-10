package com.cjl.dao;


import com.cjl.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> findAll();
    User findUserByIdAndUsername(Integer id, String username);

    void add(User user);

    void delete(int id);

    User findUserById(int id);

    void update(User user);

    /**
     * 分页查询每页记录数
     */
    List<User> findPageByPage(int start, int rows, Map<String, String[]> condition);

    /**
     * 查询总记录数
     * @return int
     * @param condition
     */
    int findTotalCount(Map<String, String[]> condition);
}
