package com.java.variable;

/* 계산을 정수형으로 해야 쓰레기 값이 안들어감*/

public class Variable {
	public static void main(String[] args) {
		
		int kor, eng, math, scien;
		int total;
		float avg;
		
		kor=95; eng=65; math=75; scien=80;
		
		total = (kor+eng+math+scien)*10;	//자릿수 오버플로우 확인할 것
		avg=(total/4)/10f;	// 소수점 유효처리를 위해
		
		System.out.println("국어\t 수학\t 영어\t 과학\t");
		System.out.printf("%d\t %d\t %d\t %d\n",kor, eng, math, scien);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
	
	}
}
