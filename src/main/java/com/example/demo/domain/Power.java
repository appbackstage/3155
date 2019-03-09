package com.example.demo.domain;

import org.apache.ibatis.type.Alias;


import java.util.Objects;


@Alias("Power")
public class Power {
    private int powerId;
    private String powerName;

    @Override
    public String toString() {
        return "Power{" +
                "powerId=" + powerId +
                ", powerName='" + powerName + '\'' +
                '}';
    }

    public Power(String powerName) {
        this.powerName = powerName;
    }

    public Power() {
    }

    public int getPowerId() {
        return powerId;
    }

    public void setPowerId(int powerId) {
        this.powerId = powerId;
    }


    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Power power = (Power) o;
        return powerId == power.powerId &&
                Objects.equals(powerName, power.powerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerId, powerName);
    }
}
