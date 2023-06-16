package com.java.class_;

public class sum1 {
	public int a;
	public int b;
	
	public static int sa;
	public static int sb;
	
	public int sum() {
		return sa+sb;
	}
	
	public int sum(int c,int d) {
		return a+b+c+d;
	}
	
	//인스턴스 멤버 변수 사용 안함 -> 인스턴스 만들필요 없음 
	//	-> static : 인스턴스 만들지 않고 호출가능
	public static int sum(int c,int d, int e) {
		return c+d+e;
	}
}