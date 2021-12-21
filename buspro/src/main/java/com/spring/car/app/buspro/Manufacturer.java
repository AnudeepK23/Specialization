package com.spring.car.app.buspro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

//import com.app.spring.Student.Student;
//import com.app.spring.Student.StudentConfig;
import com.spring.car.app.model.BMW;
import com.spring.car.app.model.Car;
import com.spring.car.app.model.Hundai;

@Component
public class Manufacturer {
	
	
	@Autowired
	Car car;
	
	public void buildCar() {
		car.demo();
	}
//
//	public static void  main(String[] args)
//	{
//		Hundai h = new Hundai();
//		h.name();
//		h.look();
//		
//		
//		BMW b = new BMW();
//		b.name();
//		b.look();
//	}
//	

}
