package com.java.print;

public class PrintTest {

	public static void main(String[] args) {
		
		int i =123;
		float f = 12.3f;
		char c= 'A';
		boolean b =true;
		String s = "123";
		
		System.out.println("���� : "+i);
		System.out.println("�Ǽ� : "+f);
		System.out.println("�ο� : "+b);
		System.out.println("���� : "+c);
		System.out.println("���ڿ� : "+s);
		System.out.println("-----------------------------");
		
		System.out.print("���� : "+i);
		System.out.print("�Ǽ� : "+f);
		System.out.print("�ο� : "+b);
		System.out.print("���� : "+c);
		System.out.print("���ڿ� : "+s);	
		System.out.print("\n-----------------------------\n");
		
		System.out.printf("���� : %d\n",i);
		System.out.printf("�Ǽ� : %f\n",f);
		System.out.printf("�ο� : %b\n",b);
		System.out.printf("���� : %c\n",c);
		System.out.printf("���ڿ� : %s\n",s);

	}

}
