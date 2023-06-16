package com.java.class_;

public class sumMain {

	public static void main(String[] args) {
		sum1 s1 = new sum1();
		sum1 s2 = new sum1();

		s1.a = 8;
		s1.b = 9;

		s2.a = 4;
		s2.b = 5;
		
		System.out.println(s1.sum(5,6));
		System.out.println(s2.sum(5,6));
		
		//인스턴스 멤버 변수 사용 안함 -> 인스턴스 만들필요 없음 
		//	-> static : 인스턴스 만들지 않고 호출가능
		//sum2 s3 = new sum2();
		//System.out.println(s3.sum(8,9));
		
		System.out.println(sum2.sum(4,5));
		
		s1.sa = 8;
		s1.sb = 9;

		s2.sa = 4;
		s2.sb = 5;
		
		System.out.println(s1.sum());
		System.out.println(s2.sum());

	}

}
