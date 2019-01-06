package com.blade.ssm.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.io.Serializable;

@Component
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String description;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Position:[id=" + id + ",name=" + name + ",description="
                + description + "]";
    }
}
