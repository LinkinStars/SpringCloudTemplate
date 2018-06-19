package com.linkinstars.feign.service.impl;

import com.linkinstars.feign.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * 测试服务 实现类
 * @author LinkinStar
 */
@Service
public class TestServiceImpl implements ITestService {

    /**
     * 断路器
     */
    @Override
    public String testFeign() {
        return "触发断路器";
    }
}
