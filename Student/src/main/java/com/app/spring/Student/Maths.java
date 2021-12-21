package com.app.spring.Student;

import org.springframework.stereotype.Component;

@Component
public class Maths implements Teacher{
	
	public void name() {
		System.out.println("Teacher name is Chiru");
	}
	
	public void teach() {
		System.out.println("Teaches Mathematics");
	}

}
