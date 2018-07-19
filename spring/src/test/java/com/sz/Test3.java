package com.sz;

import com.sz.contorller.UserContorller;
import com.sz.news.bean.Book;
import com.sz.news.bean.Girl;
import com.sz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test3 {
    @Test
    public void m1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("app4.xml");
//        UserService userService= (UserService) context.getBean("userService");
//        userService.show();

        UserContorller  userContorller= context.getBean("userContorller",UserContorller.class);
        userContorller.eat();
    }
}
