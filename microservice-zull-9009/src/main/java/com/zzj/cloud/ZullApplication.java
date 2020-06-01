package com.zzj.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by zzj on 2020/6/1.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZullApplication {
    public static void main(String[] args){
        SpringApplication.run(ZullApplication.class,args);
    }
}
