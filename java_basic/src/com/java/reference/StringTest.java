package com.java.reference;

public class StringTest {

	public static void main(String[] args) {	
		String str1 ="abc";
		
		String str2 ="abc";	//���ͷ������� ����		
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println(str1==str2);	//true : ������ġ�� ����
		
		str2 =new String("abc");	//�������� ����
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println(str1==str2);	//false : ������ġ�� �ٸ�
	}
}
