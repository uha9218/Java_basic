package com.java.class_;

import java.util.Scanner;

public class TestReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestReturn().a();
	}
	
	public void a() {
		System.out.println("a() : 시작");
		System.out.println("a() : 리턴전입니다");
		System.out.println(b());
		System.out.println("a() : 끝");
		return ;
		//System.out.println("리턴후입니다"); 컴파일에러 : 메소드 종료 후 코드 실행 불가능
		
	}
	public int b() {
		System.out.println("b() : 시작");
		c();
		System.out.println("b() : 끝");
		return 0;
	}
	public void c() {
		System.out.println("c() : 시작");
		System.out.println("c() : ");
		new Scanner(System.in).nextLine();
		System.out.println("c() : 끝");
	}
	public void d() {}
}
