package com.blade.ssm.controller;

import com.blade.ssm.model.Position;
import com.blade.ssm.model.User;
import com.blade.ssm.utils.LayuiResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/api")
public class TestDataController {

    @Autowired
    User user;

    @Autowired
    LayuiResultJson layuiResultJson;

    @RequestMapping(value = "/table/user")
    @ResponseBody
    public Object sayHello() {

        User u1 = new User();
        User u2 = new User();
        User u3 = new User();

        ArrayList<User> list =  new ArrayList<User>();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        layuiResultJson.setCount(100);
        layuiResultJson.setData(list.toArray());

        return layuiResultJson;
    }

    @RequestMapping(value = "/page")
    public String re() {
        return "hello";
    }

    @RequestMapping(value = "/array")
    @ResponseBody
    public String arr(@RequestParam(value = "ids[]")  Integer[]  ids) {

        List<Integer> list= Arrays.asList(ids);
        for (Object item: list.toArray()) {
            System.out.print(Integer.parseInt(item.toString())+" ");
        }
        System.out.println("\n长度: "+list.size());

        return String.valueOf(list.size());
    }

}
