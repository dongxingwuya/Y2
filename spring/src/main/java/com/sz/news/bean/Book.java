package com.sz.news.bean;

public class Book {
    private Double price;
    private  String name;

    public Book(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    public  void destory(){
        System.out.println("执行销毁。。。。");
    }

    public Book() {
        System.out.println("无参构造");
    }

    public  void  init(){
        System.out.println("我的书名是："+name);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
