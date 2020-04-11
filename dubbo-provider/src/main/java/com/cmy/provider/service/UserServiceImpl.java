package com.cmy.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.cmy.api.entity.User;
import com.cmy.api.service.UserService;


/**
 * @author cmy
 * @date 2020/4/1 6:26 下午
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        user.setId(1);
        System.out.println(user.toString());
        return user;
    }
}