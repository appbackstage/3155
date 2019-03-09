package com.example.demo;

import com.example.demo.Service.LoginService;
import com.example.demo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    LoginService loginService;
    @Test
    public void contextLoads() {
//       int i= loginService.loginUser("小伟","123456");
//        System.out.println(i);
    User user= loginService.findUserByUsername("白泽文");
        System.out.println(user);
    }

}
