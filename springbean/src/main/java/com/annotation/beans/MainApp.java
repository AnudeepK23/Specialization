package com.annotation.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("Beans.xml");
        Book b1 = (Book) context.getBean("book");
        System.out.println("Name : " + b1.getName() );
        System.out.println("BookId : " + b1.getBookid() );
    }
}