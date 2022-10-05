package com.nissan.bean;

	    //1.static and non -static difference in methods
		//2.pass by value and pass by reference
		//3.two return type methods - return by value and return by reference
		//4.method overloading and method overriding
		//5.string and string builder 
		//6.abstract class and interface
		//7.implementation of oops concept
		//8.dictionary examples

public class Examples {
	
	

	//static
	public static int add(int a , int b){
		
		return a+b;
	}
	
	//non-static
	public int add1(int a , int b){
		
		return a+b;
	}
	
	//pass by value
	int i =10;
	public void imp(int i){
		i += 50;
	}
	
	//pass by reference
	
	int j ;
	public Examples(){
		j=10;
	}
	
	public static void imp1(Examples ex){
		ex.j++ ;
	}
	
	//method overloading
	public static int sub(int a,int b){
		return a-b;
	}
	
	public static int sub(int a,int b,int c){
		return a-b+c;
	}
	
	public static int sub(int a){
		return a;
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		// for non static we have to create object reference to call that method add1
		Examples exam = new Examples();
		
		System.out.println(exam.add1(6, 7));
		
		//if we declare a method static then we don't require to create a object
		System.out.println(add(6, 7));

		//by -value
		System.out.println("before pass by value : " + exam.i);
		exam.imp(100);
		System.out.println("after pass by value : " + exam.i);
		
		//by-reference
		System.out.println("before pass by reference : " + exam.j);
		imp1(exam);
		System.out.println("after pass by reference : " + exam.j);
		
		//method overriding
		Exam1 e = new Exam2();
		e.animal();
		
	}

}
