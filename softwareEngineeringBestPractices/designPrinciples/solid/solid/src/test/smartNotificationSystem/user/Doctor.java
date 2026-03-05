package com.lakshay.smartNotificationSystem.user;

public class Doctor extends User{

    String level;
    String shift;

    public Doctor(String name, String address, String level, String shift) {
        super(name, address);
        this.level = level;
        this.shift = shift;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
