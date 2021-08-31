package com.raymond.controller;

import com.alibaba.fastjson.JSON;
import com.raymond.dao.UserMapper;
import com.raymond.domain.UserDO;
import com.raymond.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class TestController {
    @Autowired
    TestService testService;
    @Autowired
    UserMapper userMapper;

    @GetMapping("/log")
    @ResponseBody
    public String log(){
        log.info("kkkk");
        testService.test();
        return "success";
    }

    @GetMapping("/getUsers")
    @ResponseBody
    public String getUsers(){
        UserDO userDO = userMapper.selectByPrimaryKey(1L);
        return JSON.toJSONString(userDO);
    }
}
