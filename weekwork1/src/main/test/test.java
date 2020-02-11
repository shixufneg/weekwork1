import com.itdr.controller.IndexController;
import com.itdr.dao.IndexDao;
import com.itdr.pojo.Users;
import com.itdr.service.impl.IndexServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;
import java.util.Map;

public class test {
    @Test
    public void test05(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        IndexController indexController = ac.getBean(IndexController.class);
        String zz = indexController.zz("sxf", "sxf2", 10);
        System.out.println(zz);
    }
    @Test
    public void test06(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        IndexController indexController = ac.getBean(IndexController.class);
        indexController.zz2("sxf", "sxf2", 10);

    }
    @Test
    public void test07(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Users u = (Users) ac.getBean("users");
        System.out.println(u);

//        u.setUsername("sxf");
//        Users u2 = (Users) ac.getBean("users");
//        System.out.println(u2);
    }
    @Test
    public void test08(){
    }
}
