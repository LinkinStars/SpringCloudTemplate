package com.linkinstars.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 * @author LinkinStar
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String hello() {
        return "Now, the port is " + port;
    }
}
