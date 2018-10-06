package test.com.bookStore;

import com.AllComBeanConfig;
import com.bookStore.Box;
import com.bookStore.English;
import com.bookStore.Math;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
@ContextConfiguration(classes = AllComBeanConfig.class)
public class SpringBeans2 {

    @Autowired
    ApplicationContext context;

    @Autowired
    private Math math;

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        Box box=(Box)applicationContext.getBean("box");
        box.showBox();
    }

    @Test
    public void test(){
        math.show();

        English english=(English)context.getBean("englishBook");
        english.show();
    }

}
