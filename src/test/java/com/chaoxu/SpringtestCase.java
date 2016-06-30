package com.chaoxu;

import com.chaoxu.dao.UserDao;
import com.chaoxu.service.ServiceUserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2016/6/30.
 */
public class SpringtestCase {

    @Test
    public void testUserDao() {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userdao = (UserDao) context.getBean("userDao");

        userdao.save();

    }

    @Test
    public void testService() {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ServiceUserDao service = (ServiceUserDao) context.getBean("ServiceUserDao");

        service.test();


    }


}
