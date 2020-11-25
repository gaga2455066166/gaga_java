package com.cjl.service;

import com.cjl.domain.Cart;
import com.cjl.domain.Commodity;

import java.util.List;

public interface CartService {
    List<Cart> findCartListBySuser(String suser);
    int addCommodityToCart(Cart cart);
}
