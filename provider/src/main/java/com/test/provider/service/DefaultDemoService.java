package com.test.provider.service;

import com.test.api.consumer.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "${demo.service.version}")
public class DefaultDemoService implements DemoService {


    public String sayHello(String name) {
        System.out.println("hello");
        return "here is provider";
    }
}
