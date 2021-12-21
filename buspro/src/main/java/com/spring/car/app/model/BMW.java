package com.spring.car.app.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class BMW extends Car{
	
	public void demo() {
		System.out.println("BMW Cars");
	}
	
//	public void name() {
//		System.out.println("Car is BMW");
//	}
//	
//	public void look() {
//		System.out.println("Good looking BMW");
//	}
//	

}
