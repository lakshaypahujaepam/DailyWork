package com.lakshay.smartNotificationSystem.user;

import java.util.List;

public class Admin extends User{

    List<String> blockedServers;

    public Admin(String name, String address, List<String> blockedServers) {
        super(name, address);
        this.blockedServers = blockedServers;
    }

    public List<String> getBlockedServers() {
        return blockedServers;
    }

    public void setBlockedServers(List<String> blockedServers) {
        this.blockedServers = blockedServers;
    }
}
