package com.cmy.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cmy.api.entity.City;
import com.cmy.api.entity.User;
import com.cmy.api.service.CityDubboService;
import com.cmy.api.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author cmy
 * @date 2020/4/1 6:34 下午
 */
@Service
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