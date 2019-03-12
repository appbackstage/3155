package com.example.demo.controller;

import com.example.demo.domain.Group;
import com.example.demo.service.GroupService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GroupController {

    @Autowired
    GroupService groupService;

    @RequestMapping("groupAll")
    @ResponseBody
    public String   groupall(){
         return new Gson().toJson(groupService.getAllgroup());
    }

    @RequestMapping("groupAdd")
    @ResponseBody
    public void    groupadd(){
        for (int i = 0; i < 3; i++) {
          Group group = new Group();
            group.setGroupName("学生" + i);
            groupService.addgroup(group);
        }
        System.out.println("数据生成完毕");
    }

    @RequestMapping("groupDelete")
    @ResponseBody
    public void   groupdelete(){
      groupService.deletegroup(99);
        System.out.println("删除成功");
    }

    @RequestMapping("groupUpdate")
    @ResponseBody
    public void    groupupdate() {
        Group group = new Group();
        group.setGroupId(103);
        group.setGroupName("学生---修改");

        groupService.updategroup(group);
    }
}
