package com.cjl.service.impl;

import com.cjl.dao.CartDao;
import com.cjl.dao.impl.CartDaoImpl;
import com.cjl.domain.Cart;
import com.cjl.service.CartService;

import java.util.List;

public class CartServiceImpl implements CartService {
    private final CartDao dao = new CartDaoImpl();
    @Override
    public List<Cart> findCartListBySuser(String suser) {
        return dao.selectBySuser(suser);
    }

    @Override
    public int addCommodityToCart(Cart cart) {
        Cart bySuserAndNid = dao.selectBySuserAndNid(cart.getSuser(), cart.getNid());
        int i = 0;
        if (bySuserAndNid == null){
            //用户的cart表中没有这个商品，所以执行添加商品到cart表
            i = dao.insertByCart(cart);
        }else {
            //有这个商品，修改他的数量。
            i = dao.updateByCart(cart);
        }

        return i;
    }

    @Override
    public int removeCartByCart(Cart cart) {
//        System.out.println("cart service impl");
        return dao.deleteByCart(cart);
    }
}
