package com.sz;

import com.sz.news.bean.Book;
import com.sz.news.bean.Girl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.synth.ColorType;
import java.util.Arrays;

public class Test2 {
    @Test
    public  void  m1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("app2.xml");
        Girl girl=context.getBean("girl",Girl.class);
        System.out.println(Arrays.toString(girl.getFriends()));
        Girl girl1=context.getBean("girl2",Girl.class);
        System.out.println(girl1.getNos());
            Girl girl2=context.getBean("girl3",Girl.class);
        System.out.println(girl2.getBooks());

        Girl girl3=context.getBean("girl4",Girl.class);
        System.out.println(girl3.getFavoriteFood().get("f01").getName());

    }
    @Test
    public  void  m2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("app3.xml");

        Girl girl3=context.getBean("girl4",Girl.class);
        System.out.println(girl3.getFavoriteFood().get("f01").getName());

        Book book=context.getBean("b10",Book.class);
        System.out.println(book);

        Book book2=context.getBean("b20",Book.class);
        System.out.println(book2);
    }
}
