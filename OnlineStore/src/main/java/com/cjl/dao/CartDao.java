package com.cjl.dao;

import com.cjl.domain.Cart;

import java.util.List;

public interface CartDao {
    List<Cart> selectCartBySuser(String suser);

    Cart selectCartBySuserAndNid(String suser, Integer nid);

    int insertCart(Cart cart);

    int updateCartNquantityByCart(Cart cart);

    int deleteCartByCart(Cart cart);
}
