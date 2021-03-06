package com.example.dubbo.service;

import com.example.dubbo.domain.City;

public interface CityDubboService {
    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findCityByName(String cityName);
}
