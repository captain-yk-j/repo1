package com.sxt.controller;

import com.sxt.pojo.CityInfo;
import com.sxt.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;
    @GetMapping("find.do")
    public CityInfo find(){
        return cityService.findByid(2);
    }
}
