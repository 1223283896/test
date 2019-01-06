package com.blade.ssm.model;

import org.springframework.stereotype.Component;

@Component
public class User {

    public User() {
        this.id = 0;
        this.username = "zhijian";
        this.sex = "man";
    }

    Integer id;
    String username;
    String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
