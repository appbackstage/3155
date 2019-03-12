package com.example.demo.domain;

import org.apache.ibatis.type.Alias;

@Alias("Alias")
public class Group {
    /**
     * 属性
     * id
     * name
     */

    private int groupId;
    private String groupName;

    /**
     * 无参构造
     */
    public Group() {
    }

    /**
     * 有参构造
     * @param groupId
     * @param groupName
     */

    public Group(int groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    /**
     * 有参
     * @param groupName
     */

    public Group(String groupName) {
        this.groupName = groupName;
    }

    /**
     * id
     * get，set方法
     * @return
     */

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    /**
     * name
     * get，set方法
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * tostring方法
     * @return
     */
    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
