package com.raymond.test;

import com.alibaba.fastjson.JSON;
import com.raymond.dao.UserMapper;
import com.raymond.domain.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;

//下面两个注解可以用@SpringJunitConfig(AppConfiguration.class)替代
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
@Slf4j
public class TestService {

    @Resource
    UserMapper userMapper;
    @Resource
    DataSourceTransactionManager dataSourceTransactionManager;

    @BeforeEach
    public void init(){
    }
    @Test
    public void test(){
        log.info("llll");
    }

    @Test
    public void getUsers(){
        //这一行代码作用就是开启了事物
        TransactionStatus transaction = dataSourceTransactionManager.getTransaction(new DefaultTransactionDefinition());
        UserDO userDO = userMapper.selectByPrimaryKey(1L);
        UserDO userDO1 = userMapper.selectByPrimaryKey(1L);
        log.info(String.valueOf(userDO1==userDO));;
    }
}