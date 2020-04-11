package com.cmy.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.cmy.api.entity.City;
import com.cmy.api.service.CityDubboService;
import org.springframework.stereotype.Component;

/**
 * 城市业务 Dubbo 服务层实现层
 * <p>
 * Created by Jaycekon on 20/09/2017.
 */
// 注册为 Dubbo 服务
@Service
@Component
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {
        return new City(1L, 2L, "广州", "是我的故乡");
    }
}