package com.my.springclound.user_provider.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;


@Controller
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    public String addUser() {
        return "success";
    }
}
