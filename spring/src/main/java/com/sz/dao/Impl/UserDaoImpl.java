package com.sz.dao.Impl;

import com.sz.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void eat() {
        System.out.println("真香。。。。。。。");
    }
}
