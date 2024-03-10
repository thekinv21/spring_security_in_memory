package com.authentication.authentication.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {
    @GetMapping
    public String getSayHello() {
        return "Hello private Controller";
    }

    @GetMapping("/user")
    public String getSayHelloUser() {
        return "Hello private user Controller";
    }


    @GetMapping("/admin")
    public String getSayHelloAdmin() {
        return "Hello private admin Controller";
    }
}
