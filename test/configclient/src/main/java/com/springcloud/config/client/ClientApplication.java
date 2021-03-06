package com.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by test on 7/19/17.
 */

@EnableAutoConfiguration
@ComponentScan
@RestController
@RefreshScope
public class ClientApplication {

    @Value("${name:World!}") String name ;

    @RequestMapping("/")
    public String home(){
        return "Hello " + name;
    }


    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }

}
