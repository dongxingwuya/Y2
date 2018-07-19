package com.sz.contorller;

import com.sz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserContorller {
    @Autowired
    private UserService userService;

    public  void eat(){
        System.out.println("Controller....");
        userService.eat();
    }
}
