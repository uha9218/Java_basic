package com.java.print;

public class PrintTest {

	public static void main(String[] args) {
		
		int i =123;
		float f = 12.3f;
		char c= 'A';
		boolean b =true;
		String s = "123";
		
		System.out.println("정수 : "+i);
		System.out.println("실수 : "+f);
		System.out.println("부울 : "+b);
		System.out.println("문자 : "+c);
		System.out.println("문자열 : "+s);
		System.out.println("-----------------------------");
		
		System.out.print("정수 : "+i);
		System.out.print("실수 : "+f);
		System.out.print("부울 : "+b);
		System.out.print("문자 : "+c);
		System.out.print("문자열 : "+s);	
		System.out.print("\n-----------------------------\n");
		
		System.out.printf("정수 : %d\n",i);
		System.out.printf("실수 : %f\n",f);
		System.out.printf("부울 : %b\n",b);
		System.out.printf("문자 : %c\n",c);
		System.out.printf("문자열 : %s\n",s);

	}

}
