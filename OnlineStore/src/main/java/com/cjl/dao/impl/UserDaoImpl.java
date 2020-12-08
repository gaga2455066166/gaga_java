package com.cjl.dao.impl;

import com.cjl.dao.UserDao;
import com.cjl.domain.Commodity;
import com.cjl.domain.User;
import com.cjl.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


/**
 * 跟数据库进行交互
 */
public class UserDaoImpl implements UserDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public User selectBySuser(String suser) {
        String sql = "select * from user where suser = ?";
        User user = null;
        try {
            user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), suser);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("There is no data for this username: " + suser + " in the database!");
            return null;
        }
        return user;

    }

    @Override
    public void insertByUser(User user) {
        String sql = "insert into user(suser, spwd, sname, ssex, dbirth, semail, sphone, saddress) " +
                " values (?,?,?,?,?,?,?,?)";
        int update = template.update(sql,
                user.getSuser(),
                user.getSpwd(),
                user.getSname(),
                user.getSsex(),
                user.getDbirth(),
                user.getSemail(),
                user.getSphone(),
                user.getSaddress());
        System.out.println("insert " + update + " piece of data," + "suser:" + user.getSuser());
    }

    /**
     * 用激活码寻找用户
     *
     * @param code 激活码
     * @return 寻找到的用户
     */
    @Override
    public User selectByCode(String code) {
//        String sql = "select * from tab_user where code = ?";
//        User user = null;
//        try {
//            user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), code);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("用户激活失败：差找不到code：" + code + "对应的用户");
//        }
//        return user;
        return null;
    }

    /**
     * 修改指定用户的激活状态
     *
     * @param user 要修改的用户
     * @return 返回是否修改成功
     */
    @Override
    public boolean updateStatusByUser(User user) {
//        String sql = "update tab_user set status = 'Y' where uid = ?";
//        int update = template.update(sql, user.getUid());
//        return update > 0;
        return false;
    }

    @Override
    public List<User> selectAllUser() {
        String sql = "select * from user";
        List<User> userList = null;
        try {
            userList = template.query(sql, new BeanPropertyRowMapper<>(User.class));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the table: user");
            return null;
        }
        return userList;
    }

    @Override
    public int updateUserBySuser(User user) {
        String sql = "update user set " +
                " sname = ?, " +
                "semail = ?, " +
                "sphone = ?, " +
                "saddress = ?, " +
                "scode = ?, " +
                "nlevel = ?, " +
                "dregdate = ?, " +
                "dlastdate = ?, " +
                "nlogin = ?, " +
                "slock = ? " +
                "where suser = ?";
        int update = template.update(sql,
                user.getSname(),
                user.getSemail(),
                user.getSphone(),
                user.getSaddress(),
                user.getScode(),
                user.getNlevel(),
                user.getDregdate(),
                user.getDlastdate(),
                user.getNlogin(),
                user.getSlock(),
                user.getSuser());
        return update;
    }

    @Override
    public int userUpdateUserBySuser(User user) {
        String sql = "update user set " +
                " spwd = ?, " +
                "sname = ?, " +
                "ssex = ?, " +
                "dbirth = ?, " +
                "semail = ?, " +
                "sphone = ?, " +
                "saddress = ?, " +
                "scode = ? " +
                "where suser = ?";
        int update = template.update(sql,
                user.getSpwd(),
                user.getSname(),
                user.getSsex(),
                user.getDbirth(),
                user.getSemail(),
                user.getSphone(),
                user.getSaddress(),
                user.getScode(),
                user.getSuser());
        return update;
    }
}
