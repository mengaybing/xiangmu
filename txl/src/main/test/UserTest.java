import com.demo.dao.UserDAO;
import com.demo.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/9/20.
 */
public class UserTest {
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDAO dao=(UserDAO)ctx.getBean("userDAO");
    @Test
    public void test1(){
        dao.insertUser(new User(1,"zhangsan","123"));
        System.out.println("ok......");
    }
    @Test
    public void test2(){
        User user=dao.selectUser(new User(1,"zhangsan","123"));
        System.out.println(user);
    }

}
