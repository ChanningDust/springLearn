package test.com.bookStore;

import com.bookStore.Box;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.com.BaseTest;

public class BookStroeTest extends BaseTest {

    @Autowired
    Box box;

    @Test
    public void test(){
        box.showBox();
    }

}


