package com.example.demo.controller;

import com.example.demo.Service.LoginService;
import com.example.demo.domain.File;
import com.example.demo.domain.User;
import com.example.demo.util.MD5;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;


    @PostMapping(value = "/login")
    @ResponseBody
    public String login(@RequestParam("username") String username, @RequestParam("userpwd") String userpwd) {


        if (loginService.loginUser(username, userpwd) > 0) {

            User user1 = loginService.findUserByUsername(username);
            User admin = loginService.findUserByUsername("admin");
            List<File> admins = loginService.findFileByUserId(admin.getUserId());
            List<String> ad = new ArrayList<>();
            for (File file : admins
            ) {
                String s = file.getFileName();
                ad.add(s);
            }


            loginService.updateStateByUsername(username);

            List<File> files = loginService.findFileByUserId(user1.getUserId());

            List<String> f = new ArrayList<>();
            for (File file : files
            ) {
                String s = file.getFileName();
                f.add(s);
            }
            Map<String, String> map = new HashMap<>();
            map.put("group", String.valueOf(user1.getUserGroup()));
            map.put("role", String.valueOf(user1
                    .getUserRole()));
            map.put("files", f.toString());

            map.put("adminfiles", ad.toString());
            return new Gson().toJson(map);
        }
        return "";
    }
}
