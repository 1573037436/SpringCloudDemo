package com.zzj.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zzj on 2020/5/31.
 *
 */

@Configuration
public class ConfigBean {

    //负载均衡实际是RestTemplate根据均衡算法进行调度不同地址上的同一个微服务的部署。所以在RestTemplate上加@LoadBalanced注解。
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //通过Ribbon的核心组件IRule定义查找消费端调用提供端微服务的策略
    @Bean
    public IRule myRule(){
        //RoundRobinRule：轮询（默认）
        //RandomRule：随机
        //RetryRule：重试（先按照轮询规则获取服务，如果获取服务失败则在指定时间内进行重试）

        return new RoundRobinRule(); 	//轮询策略
    }
}
