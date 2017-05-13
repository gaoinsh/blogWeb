package com.gao.web.controller;

import com.gao.web.bean.User;
import com.gao.web.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by xgao on 2017/5/13.
 * blogWeb.
 */
@Controller
public class TestController {
    private static Logger logger = Logger.getLogger(TestController.class);
    @Resource
    private IUserService userService;

    @RequestMapping("test")
    public ModelAndView test() {
        logger.info("here i am ... ");
        User user = userService.getUserById(1);
        logger.info("user : " + user.toString());
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
