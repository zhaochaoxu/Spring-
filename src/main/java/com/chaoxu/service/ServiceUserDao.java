package com.chaoxu.service;

import com.chaoxu.dao.UserDao;

/**
 * Created by dell on 2016/6/30.
 */
public class ServiceUserDao {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void test(){
        System.out.println("我是Service里面的方法在测试UserDao！！！！");

        userDao.save();
    }
}
