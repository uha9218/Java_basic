package com.java.variable;

public class StingTest {

/*
 * 더하기 연산자로 문자열을 합칠 수 있다 ->(주의) 어떤 형을 합치든 문자열이 됨
 * 이스케이프 문자 : \ 
 */	
	
	public static void main(String[] args) {
		String str1 = "\"안녕하세요.\"\n";
		String str2 = new String("네\\안녕하세요.");
		int i = 123;
		boolean t = false; 
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1+str2+i+t);	
		System.out.println("1\t2\t3\t4\t5");
		}

}