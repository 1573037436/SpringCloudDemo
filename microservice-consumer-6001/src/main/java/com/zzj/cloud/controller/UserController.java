package com.zzj.cloud.controller;


import com.zzj.cloud.service.ConsumerService;
import com.zzj.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 不再通过地址和端口调取其它微服的应用，而是根据微服务的名来调取应用
 * Created by zzj on 2020/5/31.
 */
@RestController
public class UserController {
    //通过地址和端口，调用Provider提供的rest服务
    //private static String REST_URL_PREFIX= "http://localhost:9001";
    //直接根据微服务名调用，而不再是根据地址和端口了，运用了eureka的发现功能
    //private static String REST_URL_PREFIX = "http://microservicecloud-provider";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConsumerService service;
    @RequestMapping(value="/consumer/add")
    public boolean addUser(User user){
        //Boolean flag = restTemplate.postForObject(REST_URL_PREFIX + "/add", user, Boolean.class);
        Boolean flag=service.add(user);
        return flag;
    }

    @RequestMapping(value="/consumer/get/{id}")
    public User get(@PathVariable("id") int id){
        //User user = restTemplate.getForObject(REST_URL_PREFIX + "/get/" + id, User.class);
        User user=service.get(id);
        return user;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value="/consumer/list")
    public List<User> getList(){
        //List list = restTemplate.getForObject(REST_URL_PREFIX + "/getUser/list", List.class);
        List list=service.getAll();
        return list;
    }

}
