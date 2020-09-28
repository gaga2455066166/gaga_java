package com.cjl.service.impl;

import com.cjl.dao.Impl.UserDaoImpl;
import com.cjl.dao.UserDao;
import com.cjl.domain.User;
import com.cjl.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用dao
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByIdAndUsername(user.getId(), user.getUsername());
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void delUser(String id) {
        dao.delete(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id) {

        return dao.findUserById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    /**
     * 删除选中用户
     *
     * @param ids
     */
    @Override
    public void delUsersByids(String[] ids) {
        if (ids != null && ids.length > 0) {
            for (String id : ids) {
                dao.delete(Integer.parseInt(id));
            }
        }

    }
}
