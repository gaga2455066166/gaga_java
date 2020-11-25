package com.cjl.dao;

import com.cjl.domain.Cart;

import java.util.List;

public interface CartDao {
    List<Cart> selectBySuser(String suser);
    Cart selectBySuserAndNid(String suser, Integer nid);
    int insertByCart(Cart cart);

    int updateByCart(Cart cart);
}
