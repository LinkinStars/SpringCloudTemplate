package com.linkinstars.providers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
public class TestController {

    private static final Logger LOG = Logger.getLogger(TestController.class.getName());

    @Value("${server.port}")
    String port;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/test")
    public String hello() {
        return "Now, the port is " + port ;
    }

    @RequestMapping("/hello")
    public String hello2() {
        LOG.log(Level.INFO, "providers");
        return "hello, " + restTemplate.getForObject("http://localhost:8763/test", String.class);
    }


}
