package com.nissan.app;

import com.nissan.bean.Exam7;

 //encapsulation implementation
public class ExamApp {

	public static void main(String[] args) {
		
		Exam7 exc = new Exam7();
		
		exc.setId(1);
		exc.setName("Ashish");
		
		System.out.println(exc.getId());
		System.out.println(exc.getName());

	}

}
