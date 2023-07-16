package com.lemon;

import com.lemon.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lemoon on 2023/7/16 09:51
 *
 * SpringBoot 单元测试；
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入容器的功能
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTests {

    @Autowired
    Person person;

    @Test
    public void contextLoads(){
        System.out.println(person);
    }
}
