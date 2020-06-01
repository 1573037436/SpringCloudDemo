package com.zzj.cloud.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zzj on 2020/5/31.
 */
@Data
@NoArgsConstructor
public class User {
    public int id;
    public String name;
    public String password;
    public User(int id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }
}
