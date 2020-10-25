package com.cjl.service.impl;

import com.cjl.dao.UserDao;
import com.cjl.dao.impl.UserDaoImpl;
import com.cjl.domain.User;
import com.cjl.service.UserService;


/**
 * 逻辑，对接
 */
public class UserServiceImpl implements UserService {
    private final UserDao dao = new UserDaoImpl();


    /**
     * 注册用户
     *
     * @param user 用户
     * @return 返回是否成功的boolean
     */
    @Override
    public boolean register(User user) {
        User userByUsername = dao.findByUsername(user.getUsername());
        if (userByUsername != null) {
            //用户名在数据库中存在，注册失败
            return false;
        } else {
            //不存在，就要保存
            dao.save(user);
            return true;
        }
    }
}
