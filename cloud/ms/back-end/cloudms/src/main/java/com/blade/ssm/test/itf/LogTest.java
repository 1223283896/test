package com.blade.ssm.test.itf;

import com.blade.ssm.dao.PositionDao;
import com.blade.ssm.model.Position;
import com.blade.ssm.service.PositionService;
import com.blade.ssm.service.impl.PositionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class LogTest {

    //测试UserController .class
    public static void main(String[] args) {
        PositionService positionService = new PositionServiceImpl();

        System.out.println(Position.class);

        System.out.println(positionService.deletePosition((Integer)3));
        //这里输出 class com.heitian.ssm.controller.UserController，也就是包名带类名的绝对路径
        //这应该是Object的自带属性，和toString是一级的
    }

}
