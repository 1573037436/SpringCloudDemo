package com.zzj.cloud.controller;

import com.zzj.cloud.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzj on 2020/5/31.
 */

@RestController
public class UserController {

    @RequestMapping(value="/add", method= RequestMethod.POST)
    public boolean addUser(@RequestBody User user){
        user=new User(1,"provider9001","123456");
        return true;
    }

    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable("id") int id){
        User user=new User(id,"provider9001","123456");
        return user;
    }

    @RequestMapping(value="/getUser/list", method=RequestMethod.GET)
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        User user1=new User(1,"provider9001","123456");
        User user2=new User(1,"provider9001","123456");
        User user3=new User(1,"provider9001","123456");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }
}

