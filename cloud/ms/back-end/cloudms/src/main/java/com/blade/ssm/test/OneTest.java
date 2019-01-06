package com.blade.ssm.test;

import com.blade.ssm.dao.AdminDao;
import com.blade.ssm.dao.DepartmentDao;
import com.blade.ssm.dao.EmployeeDao;
import com.blade.ssm.dao.PostDao;
import com.blade.ssm.dto.Pos;
import com.blade.ssm.model.*;
import com.blade.ssm.service.PositionService;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class OneTest extends BaseJunit4Test{

    @Autowired
    EmployeeDao employeeDao;

    @Test
    @Transactional   //标明此方法需使用事务
    @Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚
    public void test(){
        System.out.println("************ Starting... ************");

        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("empName", "Rose");
//        paramMap.put("minCost", new Float(21));
        PageBounds pageBounds = new PageBounds();

        List<Post> list = employeeDao.find(paramMap, pageBounds);
        System.out.println(employeeDao.count());

        try {
//            System.out.println(1/0);
            throw new ClassCastException();
        } catch (Exception e) {
            System.out.println("Error!!!!!");
            System.out.println(e.getCause());
        }

//        System.out.println("************ End... ************");
    }

    @Test
    @Transactional   //标明此方法需使用事务
    @Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚
    public void test1() {
        System.out.println("end");
    }
}
