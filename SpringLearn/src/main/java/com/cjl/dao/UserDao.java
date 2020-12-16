package com.cjl.dao;

import com.cjl.domain.User;
import com.cjl.vo.QueryParam1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> selectUsers();

    User selectUserByIdUsername(@Param("id") Integer id, @Param("username") String username);

    User selectUserByParam1(QueryParam1 param1);
}
