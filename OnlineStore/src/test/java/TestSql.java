import com.cjl.dao.CartDao;
import com.cjl.dao.CommodityDao;
import com.cjl.dao.UserDao;
import com.cjl.dao.impl.CartDaoImpl;
import com.cjl.dao.impl.CommodityDaoImpl;
import com.cjl.dao.impl.UserDaoImpl;
import com.cjl.domain.Cart;
import com.cjl.service.OrderService;
import com.cjl.service.impl.OrderServiceImpl;
import org.junit.Test;

public class TestSql {
    @Test
    public void TestSelectUser(){
        UserDao dao = new UserDaoImpl();
        System.out.println(dao.selectBySuser("adminuser"));
    }

    @Test
    public void TestSelectCommodity(){
        CommodityDao dao = new CommodityDaoImpl();
        System.out.println(dao.selectByNid(10001));
    }

    @Test
    public void TestSelectAllCommodity(){
        CommodityDao dao = new CommodityDaoImpl();
        System.out.println(dao.selectAll());
    }

    @Test
    public void TestSelectScart(){
        CartDao dao = new CartDaoImpl();
//        System.out.println(dao.findBySuser("m001"));
//        System.out.println(dao.selectBySuserAndNid("adminuser",10001));
        Cart cart = new Cart();
        cart.setSuser("adminuser");
        cart.setNid(10003);
        cart.setSname("手机");
        cart.setSdescription("可以玩游戏");
        cart.setNprice(56.32);
        cart.setSimg("images/04-search_03.jpg");
        cart.setNquantity(1);
        cart.setNtotal(89.32);
        int i = dao.insertByCart(cart);
        System.out.println(i);
    }

    @Test
    public void TestUpdateCart(){
        CartDao dao = new CartDaoImpl();
//        System.out.println(dao.findBySuser("m001"));
//        System.out.println(dao.selectBySuserAndNid("adminuser",10001));
        Cart cart = new Cart();
        cart.setSuser("adminuser");
        cart.setNid(10003);
        cart.setSname("手机");
        cart.setSdescription("可以玩游戏");
        cart.setNprice(56.32);
        cart.setSimg("images/04-search_03.jpg");
        cart.setNquantity(1);
        cart.setNtotal(89.56);
        int i = dao.updateByCart(cart);
        System.out.println(i);
    }

    @Test
    public void TestSelectSorder0(){
        OrderService service = new OrderServiceImpl();
        System.out.println(service.findOrderListBySorder("date11-19"));
    }

    @Test
    public void TestSelectSorder1(){
        OrderService service = new OrderServiceImpl();
        System.out.println(service.findOrderListBySuser("dddd"));
    }
}
