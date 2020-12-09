package com.sxt.service.impl;

import com.sxt.mapper.CityMapper;
import com.sxt.pojo.CityInfo;
import com.sxt.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public CityInfo findByid(Integer cid) {
        return cityMapper.findById(cid);
    }
}
