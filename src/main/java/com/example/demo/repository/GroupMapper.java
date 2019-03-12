package com.example.demo.repository;


import com.example.demo.domain.Group;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


@Mapper
public interface GroupMapper {

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
