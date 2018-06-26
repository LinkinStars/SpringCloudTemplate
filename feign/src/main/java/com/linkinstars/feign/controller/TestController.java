package com.linkinstars.feign.controller;

import com.linkinstars.feign.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * feign访问入口
 * @author LinkinStar
 */
@RestController
public class TestController {

    @Autowired
    ITestService testService;

    private static final Logger LOG = Logger.getLogger(TestController.class.getName());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String testFeign(){
        LOG.log(Level.INFO, "feign");
        return testService.testFeign();
    }
}
