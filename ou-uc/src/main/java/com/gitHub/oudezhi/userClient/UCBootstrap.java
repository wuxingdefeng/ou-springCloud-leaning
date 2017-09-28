package com.gitHub.oudezhi.userClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2017/9/27.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UCBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UCBootstrap.class,args);
    }
}
