package com.spring.annotation.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceMain {





  
        public static void main(String[] args) {
            ApplicationContext context = new
                    ClassPathXmlApplicationContext("resource.xml");
            Employee emp= (Employee) context.getBean("myemployee");
            System.out.println(emp);




        }
    }
//        System.out.println(e1.toString());

//        Company c1 = (Company) context.getBean("mycompany");
//        c1.setAreaLocation("Mumbai");
//        c1.getAreaLocation();

