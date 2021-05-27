package cn.lightina.managebooks;

import cn.lightina.managebooks.dao.BookMapper;
import cn.lightina.managebooks.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author qingyu
 * @create 20210516:25
 */
@SpringBootTest
public class processResTest {



    User user = new User("levi", "123456");


    void main(){

//        BookMapper.processRes("1111111111111",new User());
    }
}
