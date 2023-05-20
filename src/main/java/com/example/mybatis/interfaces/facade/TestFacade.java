package com.example.mybatis.interfaces.facade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gradle")
public class TestFacade {

    @GetMapping("test")
    public Object test() {
        return "test-1";
    }


}