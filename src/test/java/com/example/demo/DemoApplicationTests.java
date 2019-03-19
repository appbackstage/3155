package com.example.demo;


import com.example.demo.Service.LoginService;
import com.example.demo.domain.File;
import com.example.demo.domain.User;
import com.example.demo.repository.LoginRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    LoginService loginService;
    @Autowired
    LoginRepository loginRepository;

    @Test
    public void contextLoads() {
//       int i= loginService.loginUser("小伟","123456");
//        System.out.println(i);
//        long startTime =  System.currentTimeMillis();
//
//         User user1= loginRepository.findUserByUsername("小伟阿");
//         System.out.println(user1);
//
//        long endTime =  System.currentTimeMillis();
//        long usedTime = (endTime-startTime);
//        System.out.println(usedTime);
        //loginService.updateStateByUsername("小伟");

        int i = loginService.findUserByGroup(2);
        System.out.println(i);


//      User user=  loginService.findUserByUsername("小伟");
//        System.out.println(user);
//        List<File> file = loginRepository.findFileByUserId(3);
//
//        System.out.println(file.size());
//
//        for (File f : file
//        ) {
//
//            String s = f.getFileName();
//
//        }
//
    }

}
