package com.example.demo.domain;

import org.apache.ibatis.type.Alias;

import java.util.Objects;

@Alias("RolePower")
public class RolePower {
    private int rolePowerId;
    private int roleId;
    private int powerId;

    @Override
    public String toString() {
        return "RolePower{" +
                "rolePowerId=" + rolePowerId +
                ", roleId=" + roleId +
                ", powerId=" + powerId +
                '}';
    }

    public RolePower(int roleId, int powerId) {
        this.roleId = roleId;
        this.powerId = powerId;
    }

    public RolePower() {
    }

    public int getRolePowerId() {
        return rolePowerId;
    }

    public void setRolePowerId(int rolePowerId) {
        this.rolePowerId = rolePowerId;
    }


    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getPowerId() {
        return powerId;
    }

    public void setPowerId(int powerId) {
        this.powerId = powerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolePower rolePower = (RolePower) o;
        return rolePowerId == rolePower.rolePowerId &&
                roleId == rolePower.roleId &&
                powerId == rolePower.powerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rolePowerId, roleId, powerId);
    }
}
