package com.java.variable;

public class StingTest {

/*
 * ���ϱ� �����ڷ� ���ڿ��� ��ĥ �� �ִ� ->(����) � ���� ��ġ�� ���ڿ��� ��
 * �̽������� ���� : \ 
 */	
	
	public static void main(String[] args) {
		String str1 = "\"�ȳ��ϼ���.\"\n";
		String str2 = new String("��\\�ȳ��ϼ���.");
		int i = 123;
		boolean t = false; 
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1+str2+i+t);	
		System.out.println("1\t2\t3\t4\t5");
		}

}