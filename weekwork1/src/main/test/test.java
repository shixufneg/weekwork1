import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;
import java.util.Map;

public class test {
    @Test
    public void test(){
        DriverManagerDataSource dm = new DriverManagerDataSource();
        dm.setDriverClassName("com.mysql.jdbc.Driver");
        dm.setUrl("jdbc:mysql://localhost:3306/javaweb");
        dm.setUsername("root");
        dm.setPassword("sxf1314...");
        //JDBC模板
        JdbcTemplate jd = new JdbcTemplate(dm);

        //测试
        String sql = "select * from users where username='sxf'";
        String sql1 = "insert into users values(null,'qwwe',123321,000,1,1,null,null)";
        List<Map<String, Object>> maps = jd.queryForList(sql);
        int update = jd.update(sql1);
        System.out.println("插入："+update);
        for (Map<String, Object> map : maps) {
            for (String s:map.keySet()) {
                System.out.println(map.get(s));
            }
        }
    }
    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        //JDBC模板
        JdbcTemplate jd = ac.getBean(JdbcTemplate.class);

        //测试
        String sql = "select * from users where username='sxf'";
        String sql1 = "insert into users values(null,'qwwe',123321,000,1,1,null,null)";
        List<Map<String, Object>> maps = jd.queryForList(sql);
//        int update = jd.update(sql1);
//        System.out.println("插入："+update);
        for (Map<String, Object> map : maps) {
            for (String s:map.keySet()) {
                System.out.println(map.get(s));
            }
        }
    }
}
