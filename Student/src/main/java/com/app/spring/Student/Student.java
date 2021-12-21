package com.app.spring.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
//public void details() {
//	System.out.println("Students details");
//}
	
	
	
	@Autowired
	@Qualifier("maths")
	Teacher tech;
	
	public void Teacherdetails() {
		tech.name();
		tech.teach();
	}
}
