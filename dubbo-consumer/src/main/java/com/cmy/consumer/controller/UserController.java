package com.cmy.consumer.controller;

import com.cmy.consumer.service.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private CityDubboConsumerService cityDubboConsumerService;

    @GetMapping("/save")
    public Object saveUser() {
        return cityDubboConsumerService.saveUser();
    }
}