package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author:李强
 * @Date:2025/4/6
 * @Description:chapter14
 */

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("红楼梦", "曹雪芹", 200));
        col.add(new Book("三国演义", "罗贯中", 200));
        col.add(new Book("小李飞刀", "古龙", 200));

        //1、先得到col对应的迭代器
        Iterator iterator = col.iterator();
        //2、使用while循环遍历
        while (iterator.hasNext()) {//判断是否还有数据
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        //itit回车 ctrl+j显示所有快捷键

        //3、当退出while循环后，这是iterator迭代器指向最后的元素
        //iterator.next();//noSuchElementException
        //4、如果希望再次遍历，需要重置我们的迭代器
        iterator = col.iterator();
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}