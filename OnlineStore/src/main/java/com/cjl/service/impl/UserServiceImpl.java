package com.cjl.service.impl;

import com.cjl.dao.UserDao;
import com.cjl.dao.impl.UserDaoImpl;
import com.cjl.domain.User;
import com.cjl.service.UserService;
import com.cjl.util.MailUtils;


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
        User userByUsername = dao.findBySuser(user.getSuser());
        if (userByUsername != null) {
            //用户名在数据库中存在，注册失败
            return false;
        } else {
            //不存在，就要保存
//            user.setCode(UuidUtil.getUuid());
//            user.setStatus("N");
            dao.save(user);
            //String content = "<a href='http://localhost:8080/Web1_war_exploded/ActiveUserServlet?code=" + user.getCode() + "'>点击注册激活邮件</a>";
            MailUtils.sendMail(user.getSemail(), "content", "激活邮件");
            return true;
        }
    }

    /**
     * 激活用户
     *
     * @param code 唯一的激活
     * @return 是否成功
     */
    @Override
    public boolean active(String code) {
//        User user = dao.findByCode(code);
//        if (user != null){
//            //说明用户是存在的，激活用户
//            boolean flag = dao.updateStatus(user);
//            return flag;
//        }else {
//            return false;
//        }
        return false;
    }

    @Override
    public boolean login(User user) {
        User userByUsername = dao.findBySuser(user.getSuser());
        return user.getSpwd().equals(userByUsername.getSpwd());
    }

    @Override
    public User findUserBySuser(String suser) {
        return dao.findBySuser(suser);
    }
}
