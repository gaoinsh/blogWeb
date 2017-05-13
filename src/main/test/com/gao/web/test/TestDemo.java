package com.gao.web.test;

import com.alibaba.fastjson.JSON;
import com.gao.web.bean.User;
import com.gao.web.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by xgao on 2017/5/13.
 * blogWeb.
 */

@RunWith(SpringJUnit4ClassRunner.class)        //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContent.xml"})
public class TestDemo {
    private static Logger logger = Logger.getLogger(TestDemo.class);

    @Resource
    private IUserService userService;


    @Test
    public void daoTest() {
        User user = userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
    }
}
