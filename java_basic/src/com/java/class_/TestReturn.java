package com.java.class_;

import java.util.Scanner;

public class TestReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestReturn().a();
	}
	
	public void a() {
		System.out.println("a() : ����");
		System.out.println("a() : �������Դϴ�");
		System.out.println(b());
		System.out.println("a() : ��");
		return ;
		//System.out.println("�������Դϴ�"); �����Ͽ��� : �޼ҵ� ���� �� �ڵ� ���� �Ұ���
		
	}
	public int b() {
		System.out.println("b() : ����");
		c();
		System.out.println("b() : ��");
		return 0;
	}
	public void c() {
		System.out.println("c() : ����");
		System.out.println("c() : ");
		new Scanner(System.in).nextLine();
		System.out.println("c() : ��");
	}
	public void d() {}
}
