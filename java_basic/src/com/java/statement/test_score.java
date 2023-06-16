package com.java.statement;

import java.util.Scanner;

/*
 * 성적 프로그램에서 성적별 구간에 따라 학점 추가
 */
public class test_score {

	public static void main(String[] args) {
		int kor=0, eng=0, math=0, scien=0;
		int total;
		float avg;
		char score=' ';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오.");
		System.out.print("국어 : ");
		kor = scan.nextInt();
		System.out.print("영어 : ");
		eng = scan.nextInt();
		System.out.print("수학 : ");
		math = scan.nextInt();
		System.out.print("과학 : ");
		scien = scan.nextInt();
		
		total = (kor+eng+math+scien)*10;	//자릿수 오버플로우 확인할 것
		avg=(total/4)/10f;	// 소수점 유효처리를 위해
		total = total/10;
		
		//평균을 10으로 나눠서 십의 자리수를 기준으로 성적을 나눔 
		if(avg/10>=9) {score='A';}
		else if(avg/10>8) {score='B';}
		else if(avg/10>7) {score='C';}
		else if(avg/10>6) {score='D';}
		else  {score='F';}
		
		System.out.println("국어\t 영어\t 수학\t 과학\t");
		System.out.printf("%d\t %d\t %d\t %d\n",kor, eng, math, scien);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		System.out.println("학점 : "+score);
	

	}

}
