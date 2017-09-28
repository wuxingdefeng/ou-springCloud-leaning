package com.gitHub.oudezhi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2017/9/28.
 */
@EnableAutoConfiguration
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBootstrap.class,args);
    }
}
