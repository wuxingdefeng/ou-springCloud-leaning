package com.gitHub.oudezhi.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2017/9/28.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GateServerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(GateServerBootstrap.class,args);
    }
}
