package com.cjl.service.impl;

import com.cjl.dao.Impl.UserDaoImpl;
import com.cjl.dao.UserDao;
import com.cjl.domain.PageBean;
import com.cjl.domain.User;
import com.cjl.service.UserService;

import java.util.List;
import java.util.Map;

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
     */
    @Override
    public void delUsersByids(String[] ids) {
        if (ids != null && ids.length > 0) {
            for (String id : ids) {
                dao.delete(Integer.parseInt(id));
            }
        }

    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);
        int totalCount = dao.findTotalCount(condition);
        int start = (currentPage - 1) * rows;
        List<User> list = dao.findPageByPage(start, rows,condition);
        int totalPage = totalCount % rows == 0 ? totalCount / rows : totalCount / rows + 1;
        System.out.println(totalPage);
        System.out.println(currentPage);

        //创建空的pagebean对象
        PageBean<User> pb = new PageBean<>();

        //设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);
        pb.setTotalCount(totalCount);
        pb.setList(list);
        pb.setTotalPage(totalPage);
        return pb;
    }
}
