package com.linkinstars.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 测试controller
 * @author LinkinStar
 */
@RestController
public class TestController {

    private static final Logger LOG = Logger.getLogger(TestController.class.getName());

    @Value("${server.port}")
    String port;

    @Value("${test-url}")
    String testUrl;

    @RequestMapping("/test")
    public String hello() {
        LOG.log(Level.INFO, "provider");
        return "Now, the port is " + port + "      The test url is " + testUrl;
    }
}
