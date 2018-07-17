package com.my.springclound.user_provider.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String addUser() {
        return "success";
    }
}
