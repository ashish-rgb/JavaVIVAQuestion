package com.nissan.bean;

public class Exam3 {
	
	//string
	public static void str1(String str){
		
		str = str + " is good ";
		
	}
	
	//string builder
public static void str2(StringBuilder str){
		
		str = str.append(" is good ");
		
	}

   //stringbuffer
public static void str3(StringBuffer str){
	
	str = str.append(" is good ");
	
}

	public static void main(String[] args) {
		
		//string imp
		String st = "Faith Infotech";
		
		str1(st);
		
		System.out.println("Using simple String : " + st);
		
		//stringbuilder imp
		StringBuilder st1 = new StringBuilder("Faith Infotech");
		
		str2(st1);
		System.out.println("USing string builder : " + st1);
		
		//stringbuffer imp - thread safe
		StringBuffer st2 = new StringBuffer("Faith Infotech");
		
		str3(st2);
		System.out.println("Using String Buffer : " + st2);
	}

}
