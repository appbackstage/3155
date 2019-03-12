package com.example.demo.service.impl;


import com.example.demo.domain.Group;
import com.example.demo.repository.GroupMapper;
import com.example.demo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {

    /**
     * 注入接口GroupMappers
     */
    @Autowired
    GroupMapper groupMapper;


    /**
     * service方法查
     * @return
     */
    @Override
    public List<Group> getAllgroup() {
        return  groupMapper.getAllgroup();
    }

    /**
     * service添加方法
     * @param groups
     */

    @Override
    public void addgroup(Group groups) {
        groupMapper.addgroup(groups);
    }

    /**
     * service删除方法
     * @param id
     */

    @Override
    public void deletegroup(int id) {
        groupMapper.deletegroup(id);
    }

    /**
     * service修改方法
     * @param groups
     */

    @Override
    public void updategroup(Group groups) {
        groupMapper.updategroup(groups);
    }
}
