package com.example.dubbo.service;

import com.example.dubbo.domain.City;

/**
 * @author cmy
 * @date 2020/4/1 6:50 下午
 */
public interface CityDubboService {
    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findCityByName(String cityName);
}
