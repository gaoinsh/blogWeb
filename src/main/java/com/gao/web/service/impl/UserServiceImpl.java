package com.gao.web.service.impl;

import com.gao.web.bean.User;
import com.gao.web.dao.UserDao;
import com.gao.web.service.IUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by xgao on 2017/5/13.
 * blogWeb.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;


    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
