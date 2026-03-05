package com.lakshay.smartNotificationSystem.user;

public class Patient extends User{

    String bloodGroup;
    String condition;

    public Patient(String name, String address, String bloodGroup, String condition) {
        super(name, address);
        this.bloodGroup = bloodGroup;
        this.condition = condition;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
