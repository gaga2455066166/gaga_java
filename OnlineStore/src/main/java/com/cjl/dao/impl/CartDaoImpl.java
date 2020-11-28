package com.cjl.dao.impl;

import com.cjl.dao.CartDao;
import com.cjl.domain.Cart;
import com.cjl.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CartDaoImpl implements CartDao {
    private final JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Cart> selectCartBySuser(String suser) {
        String sql = "select * from cart where suser = ?";
        List<Cart> carts = null;
        try {
            carts = template.query(sql, new BeanPropertyRowMapper<>(Cart.class), suser);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the database!");
            return null;
        }
        return carts;
    }

    @Override
    public Cart selectCartBySuserAndNid(String suser, Integer nid) {
        String sql = "select * from cart where suser = ? and nid = ?";
        Cart cart = null;
        try {
            cart = template.queryForObject(sql, new BeanPropertyRowMapper<>(Cart.class), suser, nid);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no data in the table : cart");
            return null;
        }
        return cart;
    }

    @Override
    public int insertCart(Cart cart) {
//        (suser, nid, sname, sdescription, nprice, simg, nquantity, ntotal)
        String sql = "insert into cart values (?,?,?,?,?,?,?,?)";
        int update = 0;
        try {
            update = template.update(sql,
                    cart.getSuser(),
                    cart.getNid(),
                    cart.getSname(),
                    cart.getSdescription(),
                    cart.getNprice(),
                    cart.getSimg(),
                    cart.getNquantity(),
                    cart.getNtotal());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Insert 0 ");
            return 0;
        }
        return update;
    }

    @Override
    public int updateCartNquantityByCart(Cart cart) {
        String sql = "update cart set nquantity = nquantity + ? , ntotal = ntotal + ? where nid = ?";
//        String sql = "update cart set ntotal = ntotal + ? where nid = ?";
        int update = 0;
        try {
            update = template.update(sql,
                    cart.getNquantity(),
                    cart.getNtotal(),
                    cart.getNid());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Update 0");
            return 0;
        }
        return update;
    }

    @Override
    public int deleteCartByCart(Cart cart) {
//        System.out.println("cart dao impl");
        System.out.println(cart);
        String sql = "delete from cart where suser = ? and nid = ?";
//        String sql = "update cart set ntotal = ntotal + ? where nid = ?";
        int delete = 0;
        try {
            delete = template.update(sql,
                    cart.getSuser(),
                    cart.getNid());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Delete 0");
            return 0;
        }
        return delete;
    }
}
