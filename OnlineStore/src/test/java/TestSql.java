import com.cjl.dao.CommodityDao;
import com.cjl.dao.UserDao;
import com.cjl.dao.impl.CommodityDaoImpl;
import com.cjl.dao.impl.UserDaoImpl;
import com.cjl.service.UserService;
import com.cjl.service.impl.UserServiceImpl;
import org.junit.Test;

public class TestSql {
    @Test
    public void TestSelectUser(){
        UserDao dao = new UserDaoImpl();
        System.out.println(dao.findBySuser("adminuser"));
    }

    @Test
    public void TestSelectCommodity(){
        CommodityDao dao = new CommodityDaoImpl();
        System.out.println(dao.findByNid(10001));
    }

    @Test
    public void TestSelectAllCommodity(){
        CommodityDao dao = new CommodityDaoImpl();
        System.out.println(dao.findAllCommodity());
    }
}
