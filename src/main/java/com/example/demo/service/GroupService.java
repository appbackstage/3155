package com.example.demo.service;

import com.example.demo.domain.Group;

import java.util.List;

public interface GroupService {

    /**
     * 查寻接口
     * @return
     */
    List<Group> getAllgroup();

    /**
     * 添加接口
     * @param group
     */

    void addgroup(Group group);

    /**
     * 删除接口
     * @param id
     */
    void deletegroup(int id);

    /**
     * 修改接口
     * @param group
     */
    void updategroup(Group group);

}
