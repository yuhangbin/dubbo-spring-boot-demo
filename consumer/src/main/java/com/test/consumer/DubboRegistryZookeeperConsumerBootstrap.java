package com.test.consumer;

import com.test.api.consumer.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class DubboRegistryZookeeperConsumerBootstrap {

    @DubboReference(version = "${demo.service.version}")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DubboRegistryZookeeperConsumerBootstrap.class).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> demoService.sayHello("hello");
    }
}
