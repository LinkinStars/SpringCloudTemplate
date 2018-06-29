package com.linkinstars.providers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 测试controller
 * @author LinkinStar
 */
@RestController
public class Test2Controller {

    private static final Logger LOG = Logger.getLogger(Test2Controller.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hello")
    public String hello2() {
        LOG.log(Level.INFO, "providers");
        return "hello, " + restTemplate.getForObject("http://localhost:8763/test", String.class);
    }


}
