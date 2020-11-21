package com.cjl.dao;

import com.cjl.domain.User;

public interface UserDao {
    /**
     * 查询是否有这个用户
     *
     * @param suser 传进来的用户名
     * @return 根据信息查找到的用户名
     */
    User selectBySuser(String suser);

    /**
     * 保存
     * @param user 传进来一个要保存的用户user
     */
    void insertByUser(User user);

    User selectByCode(String code);

    boolean updateStatusByUser(User user);
}
