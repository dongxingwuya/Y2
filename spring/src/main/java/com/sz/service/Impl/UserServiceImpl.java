package com.sz.service.Impl;

import com.sz.dao.UserDao;
import com.sz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Component 组件（如果我们不明确这个组件的含义定位是什么）
 * @Service 业务层
 * @Repository dao层
 * @ controller 控制层
 */

//注册一个bean的注解（类似于在xml中注册一个bean是一样的）
//@Component("userService")


    @Service("userService")
public class UserServiceImpl implements UserService {

        @Autowired
        private UserDao userDao;
    @Override
    public void show() {
        System.out.println("Show   Time............");
    }

    @Override
    public void eat() {
        System.out.println("service.........");
        userDao.eat();
    }
}
