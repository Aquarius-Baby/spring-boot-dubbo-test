package com.example.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;

import com.example.dubbo.domain.City;
import com.example.dubbo.domain.User;
import org.springframework.stereotype.Component;

/**
 * @author cmy
 * @date 2020/4/1 6:34 下午
 */

@Component
public class CityDubboConsumerService {

    @Reference
    CityDubboService cityDubboService;

    @Reference
    UserService userService;

    public void printCity() {
        String cityName = "广州";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }


    public User saveUser() {
        User user = new User();
        user.setUsername("jaycekon");
        user.setPassword("jaycekong824");
        return userService.saveUser(user);
    }
}