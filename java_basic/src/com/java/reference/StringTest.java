package com.java.reference;

public class StringTest {

	public static void main(String[] args) {	
		String str1 ="abc";
		
		String str2 ="abc";	//리터럴영역에 저장		
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println(str1==str2);	//true : 저장위치가 같음
		
		str2 =new String("abc");	//힙영역에 저장
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println(str1==str2);	//false : 저장위치가 다름
	}
}
