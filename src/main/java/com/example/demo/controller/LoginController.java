package com.example.demo.controller;

import com.example.demo.Service.LoginService;
import com.example.demo.domain.File;
import com.example.demo.domain.User;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;


    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(@RequestBody User user) {

        if (loginService.loginUser(user.getUserName(),user.getUserPwd())>0) {
            System.out.println("************************");
            System.out.println(user.getUserName());
            User user1 = loginService.findUserByUsername(user.getUserName());
            System.out.println(user1);
            loginService.updateStateByUsername(user.getUserName());

            List<File> files = loginService.findFileByUserId(user1.getUserId());
            files.forEach(System.out::println);
            List<String> f = new ArrayList<>();
            for (File file : files
            ) {
                String s = file.getFileName();
                f.add(s);
            }
            System.out.println(f);
            Map<String, String> map = new HashMap<>();
            map.put("role", String.valueOf(user1
                    .getUserRole()));
            map.put("aa",f.toString());
            map.put("group", String.valueOf(user1.getUserGroup()));
            return new Gson().toJson(map);
        }
        return "11111111111111";
    }
}
