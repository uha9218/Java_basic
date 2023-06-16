package com.java.class_;

import java.util.StringTokenizer;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		System.out.println(str.charAt(3));
		System.out.println(str.contains("ABCD"));
		System.out.println(str.equals("123"));
		
		String str1 ="abc";
		String str2 ="ABC";
		
		System.out.println(str1.equals(str2));	//대소문자 구분
		System.out.println(str1.equalsIgnoreCase(str2));	//대소문자 구분x
		
		System.out.println(str.indexOf("RS"));
		
		System.out.println(str.isEmpty());
		
		String str3 ="123abc123";
		System.out.println(str3.indexOf("123"));
		System.out.println(str3.lastIndexOf("123"));
		
		System.out.println(str.length());

		System.out.println(str3.replace("abc","bcd"));
		
		String str4 = "a/b/c";
		String[] split =str4.split("/");
		for(String x : split) System.out.println(x);
		
		System.out.println(str.substring(9));
		System.out.println(str.substring(0,9));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str5 = "  123    456 789  ";
		System.out.println(str5.trim());
		
		String str6 ="국어, 영어, 수학, 과학, 도덕, 사회 ,미술, 체육";
		StringTokenizer token = new StringTokenizer(str6,",",true);
		while(token.hasMoreElements()) {
			System.out.println(token.nextElement());
		}
		
	}

}
