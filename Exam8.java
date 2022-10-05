package com.nissan.bean;

import java.util.Dictionary;
import java.util.Hashtable;

//dictionary example
public class Exam8 {

	public static void main(String[] args) {
		
		//initializing dictionary
		Dictionary dic = new Hashtable();
		
		//adding value to dictionary
		dic.put(1, "Ashish");
		dic.put(2, "Rahul");
		
		System.out.println(dic);
		
	}
	
}
