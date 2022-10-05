package com.nissan.bean;

import com.nissan.library.Exam5;

//inheritance
public class Exam6 extends Exam4 implements Exam5 {

	//implementation of interface method
	public void vehicle1(){
		System.out.println("Hello there");
	}

	//implementation of abstract method
	@Override
	public void vehicle() {
		System.out.println("Hi");
		
	}
}
