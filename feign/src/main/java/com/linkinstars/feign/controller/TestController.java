package com.linkinstars.feign.controller;

import com.linkinstars.feign.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign访问入口
 * @author LinkinStar
 */
@RestController
public class TestController {

    @Autowired
    ITestService testService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String testFeign(){
        return testService.testFeign();
    }
}
