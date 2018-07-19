package com.sz;

import com.sz.news.bean.Book;
import com.sz.news.bean.Fire;
import com.sz.news.bean.Food;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void m1(){
        //spring容器注册，当我们去初始化上下文，就已经注册完毕了，不需要我们getBean
        //spring默认采用的方式是单例模式注册bean singleton,省内存。
        ApplicationContext context= new ClassPathXmlApplicationContext("app1.xml");
                Book book= (Book) context.getBean("book");
                Book book2= (Book) context.getBean("book");
                  System.out.println(book==book2);

                  Book book3=new Book();
             System.out.println(book==book3);

        Book b2= (Book) context.getBean("book2");
        Book b3= (Book) context.getBean("book2");
        System.out.println(b2==b3);
        Food food= (Food) context.getBean("food");
//        Fire fire= (Fire) context.getBean("fire");
        //destory方法要在我们上下文手工关闭后才会执行。
//        ((ClassPathXmlApplicationContext) context).close();
        Book b7=context.getBean("b7",Book.class);
        System.out.println(b7);

    }

    @Test
    public  void  m2(){

    }
}
