package com.example.demo.domain;

import org.apache.ibatis.type.Alias;


import java.io.Serializable;
import java.util.Objects;

@Alias("Alias")
public class Group implements Serializable {
    private int groupId;
    private String groupName;

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public Group() {
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupId == group.groupId &&
                Objects.equals(groupName, group.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName);
    }
}
