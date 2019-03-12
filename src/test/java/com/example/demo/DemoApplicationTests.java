package com.example.demo;

import com.example.demo.domain.Group;
import com.example.demo.repository.GroupMapper;
import com.example.demo.service.GroupService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    GroupService groupService;

    @Test
    public void contextLoads() {

        groupService.getAllgroup().forEach(System.out::println);

        groupService.addgroup(new Group("xxx"));
    }

}
