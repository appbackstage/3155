package com.example.demo.domain;

import org.apache.ibatis.type.Alias;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Alias("User")
public class User {
    private int userId;
    private String userName;
    private String userPwd;
    private int userRole;
    private int userGroup;
    private Integer userState;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userRole=" + userRole +
                ", userGroup=" + userGroup +
                ", userState=" + userState +
                '}';
    }

    public User(String userName, String userPwd, int userRole, int userGroup, Integer userState) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.userRole = userRole;
        this.userGroup = userGroup;
        this.userState = userState;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }


    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }


    public int getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(int userGroup) {
        this.userGroup = userGroup;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId &&
                userRole == user.userRole &&
                userGroup == user.userGroup &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(userPwd, user.userPwd) &&
                Objects.equals(userState, user.userState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPwd, userRole, userGroup, userState);
    }
}
