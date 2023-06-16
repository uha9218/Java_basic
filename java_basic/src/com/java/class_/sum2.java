package com.java.class_;

public class sum2 {

	public static int sum(int a,int b) {
		System.out.println("sum(int a, int b)");
		return a+b;
	}
	public static int sum(int a, int b,int c) {
		System.out.println("sum(int a, int b, int c)");
		return a+b+c;
	}
	
	public  static int sum(int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) sum=sum+a[i];
		System.out.println("sum(int ...a)");
		return sum;
	}
}
