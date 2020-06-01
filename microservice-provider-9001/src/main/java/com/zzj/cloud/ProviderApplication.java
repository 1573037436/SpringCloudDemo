package com.zzj.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zzj on 2020/5/31.
 */
@SpringBootApplication
@EnableEurekaClient  //本服务启动后会自动注册进eureka服务中
public class ProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProviderApplication.class, args);
    }

}
