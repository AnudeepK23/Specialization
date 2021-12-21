package com.spring.car.app.buspro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.car.app.model.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(Carconfig.class);
    	Manufacturer man=context.getBean("manufacturer", Manufacturer.class);
    	man.buildCar();
    	
    	
    	
        //System.out.println( "Hello World!" );
    }
}
