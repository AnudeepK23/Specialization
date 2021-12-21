package com.spring.car.app.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Component;



@Component
public class Hundai extends Car{
	public void demo() {
		System.out.println("Hundai cars");
	}
	
	

//	public void name() {
//		System.out.println("Car is hundai");
//	}
//	
//	public void look() {
//		System.out.println("Good looking");
//	}
//	

}
