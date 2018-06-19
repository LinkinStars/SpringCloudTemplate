package com.linkinstars.feign.service;

import com.linkinstars.feign.service.impl.TestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign服务
 * @author LinkinStar
 */
@FeignClient(value = "service-provider", fallback = TestServiceImpl.class)
public interface ITestService {

    /**
     * 测试负载均衡
     * @return hello world
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String testFeign();
}
