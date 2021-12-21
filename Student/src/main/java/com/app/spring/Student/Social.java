package com.app.spring.Student;

import org.springframework.stereotype.Component;

@Component
public class Social implements Teacher{
	
	public void name() {
		System.out.println("Teacher name is Santhu");
	}
	
	public void teach() {
		System.out.println("Teaches Social");
	}

}
