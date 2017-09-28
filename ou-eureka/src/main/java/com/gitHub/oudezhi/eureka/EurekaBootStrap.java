package com.gitHub.oudezhi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2017/9/27.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaBootStrap.class,args);
    }
}
