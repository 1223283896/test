package com.blade.ssm.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.blade.ssm.dto.Pos;
import com.blade.ssm.model.Position;
import com.blade.ssm.service.PositionService;
import com.blade.ssm.utils.LayuiResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@RequestMapping(value = "/api/position")
public class PositionController {

    @Autowired
    PositionService positionService;

    @Autowired
    Position position;

    @Autowired
    LayuiResultJson layuiResultJson;

    @RequestMapping("/save")
    //@ResponseBody
    public String save(Pos pos) throws Exception {

        if (pos.getId() != null) {

            position.setName(pos.getTitle());
            position.setDescription(pos.getDesc());
            position.setId(pos.getId());

            int re =positionService.updatePosition(position);

            //这里应该有个注入
            return "returnModifyPosition";
        } else {
            position.setName(pos.getTitle());
            position.setDescription(pos.getDesc());
            positionService.addPosition(position);
            return "returnAddPosition";
        }
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list() {

        return null;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public Integer delete(@RequestParam(value = "ids[]") Integer[] ids) {

        System.out.println("***************************");
        int changed = 0;

        List<Integer> list= Arrays.asList(ids);
        for (Object item: list.toArray()) {
            System.out.print(Integer.parseInt(item.toString())+" ");
        }
        System.out.println("\n长度: "+list.size());

        int result = 0;
        for (Integer i: list) {
            if (positionService.deletePosition((Integer) i) == 1) {
                changed++;
            }
            System.out.println(i);
        }

        System.out.println("return");
        if (changed == list.size()) {
            return list.size();
        } else {
            return 0;
        }
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public Object getPos(HttpServletRequest request) {

        HashMap<String, Object> map = new HashMap<String, Object>();
        List<Position> list = positionService.findPositions(null);
        System.out.println("当前职位数目" + list.size());

        layuiResultJson.setCode(0);
        layuiResultJson.setMsg("");
        layuiResultJson.setCount(list.size());
        layuiResultJson.setData(list.toArray());

        return layuiResultJson;
    }

}
