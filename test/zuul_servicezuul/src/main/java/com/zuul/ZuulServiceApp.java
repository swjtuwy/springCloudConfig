package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by test on 8/4/17.
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApp.class, args);
    }
}
